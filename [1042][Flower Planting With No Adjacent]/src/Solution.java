import java.util.*;

class Solution {
    public int[] gardenNoAdj(int n, int[][] paths) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for(int[] path : paths) {
            graph.computeIfAbsent(path[0] - 1, k -> new HashSet<>()).add(path[1] - 1);
            graph.computeIfAbsent(path[1] - 1, k -> new HashSet<>()).add(path[0] - 1);
        }
        int[] result = new int[n];
        
        for(int garden = 0; garden < n; garden++) {
            boolean[] colorNeigborUsed = new boolean[5];
            if(graph.get(garden) != null) {
                for(int neighbor : graph.get(garden)) {
                    colorNeigborUsed[result[neighbor]] = true;
                }
            }
            for(int color = 4; color >= 1; color--) {
                if(!colorNeigborUsed[color]) {
                    result[garden] = color;
                }
            }
        }
        
        return result;
    }
}