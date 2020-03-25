package app;

import java.util.*;

public class Solution {
    public int numBusesToDestination(int[][] routes, int S, int T) {
        if(S == T) return 0;
        int result = 1;
        Set<Integer> taken = new HashSet<>();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 0; i < routes.length; i++) {
            for(int j = 0; j < routes[i].length; j++) {
                graph.computeIfAbsent(routes[i][j], k-> new ArrayList<>()).add(i);
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(S);

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int station = queue.poll();
                for(int bus : graph.get(station)) {
                    if(taken.add(bus)) {
                        for(int j = 0; j < routes[bus].length; j++) {
                            if(routes[bus][j] == T) {
                                return result;
                            }
                            else {
                                queue.add(routes[bus][j]);
                            }
                        }
                    }
                }
            }
            result++;
        }
        return -1;
    }
}