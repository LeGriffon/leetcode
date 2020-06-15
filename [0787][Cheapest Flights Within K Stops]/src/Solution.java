import java.util.*;

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        Map<Integer, Map<Integer, Integer>> prices = new HashMap<>();
        for(int[] flight : flights) {
            prices.computeIfAbsent(flight[0], k -> new HashMap<>()).put(flight[1], flight[2]);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        pq.add(new int[] {0, src, K + 1});

        while(!pq.isEmpty()) {
            int[] top = pq.remove();
            int cost = top[0];
            int city = top[1];
            int stops = top[2];
            if(city == dst) return cost;
            if(stops > 0) {
                Map<Integer, Integer> adjacency = prices.getOrDefault(city, new HashMap<>());
                for(int neighbor : adjacency.keySet()) {
                    pq.add(new int[] {cost + adjacency.get(neighbor), neighbor, stops - 1});
                }
            }
        }
        return -1;
    }
}