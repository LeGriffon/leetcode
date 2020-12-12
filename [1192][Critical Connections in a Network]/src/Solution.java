import java.util.*;

class Solution {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for(List<Integer> connection : connections) {
            graph.get(connection.get(0)).add(connection.get(1));
            graph.get(connection.get(1)).add(connection.get(0));
        }
        int[] ranks = new int[n];
        Arrays.fill(ranks, -2);
        Set<List<Integer>> collectionSet = new HashSet<>(connections);
        dfsHelper(0, 0, ranks, graph, collectionSet);
        return new ArrayList<List<Integer>>(collectionSet);
    }
    
    private int dfsHelper(int node, int depth, int[] ranks, List<List<Integer>> graph, Set<List<Integer>> collectionSet) {
        if(ranks[node] >= 0) return ranks[node];
        ranks[node] = depth;
        int minDepth = depth;
        for(int neighbor : graph.get(node)) {
            if(ranks[neighbor] == depth - 1) continue;
            int minDepthReturn = dfsHelper(neighbor, depth + 1, ranks, graph, collectionSet);
            minDepth = Math.min(minDepth, minDepthReturn);
            if(minDepthReturn <= depth) {
                collectionSet.remove(Arrays.asList(neighbor, node));
                collectionSet.remove(Arrays.asList(node, neighbor));
            }
        }
        return minDepth;
    }
}