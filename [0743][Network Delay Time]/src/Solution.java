import java.util.*;

class Solution {
    public int networkDelayTime(int[][] times, int N, int K) {
        Map<Integer, Integer> dist = new HashMap<>();
        Map<Integer, List<int[]>> graph = new HashMap<>();
        
        for(int[] edge : times) {
            graph.computeIfAbsent(edge[0], k -> new ArrayList<int[]>()).add(new int[] {edge[1], edge[2]});
        }
        PriorityQueue<int[]> heap = new PriorityQueue<int[]>((info1, info2) -> info1[0] - info2[0]);
        heap.offer(new int[] {0, K});
        
        while(!heap.isEmpty()) {
            int[] info = heap.poll();
            int d = info[0];
            int node = info[1];
            if(dist.containsKey(node)) continue;
            dist.put(node, d);
            
            if(graph.containsKey(node)) {
                for(int[] edge : graph.get(node)) {
                    int neighbor = edge[0];
                    int d2 = edge[1];
                    if(!dist.containsKey(neighbor)) {
                        heap.offer(new int[] {d + d2, neighbor});
                    }
                }
            }
        }
        if(dist.size() != N) return -1;
        int result = 0;
        for(int candidate : dist.values()) {
            result = Math.max(result, candidate);
        }
        return result;
    }
}