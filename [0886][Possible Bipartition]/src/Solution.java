import java.util.*;

class Solution {
    List<List<Integer>> graph = new ArrayList<>();
    Map<Integer, Integer> party = new HashMap<>();;
    public boolean possibleBipartition(int N, int[][] dislikes) {
        for(int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] edge : dislikes) {
            graph.get(edge[0] - 1).add(edge[1] - 1);
            graph.get(edge[1] - 1).add(edge[0] - 1);
        }
        for(int i = 0; i < N; i++) {
            if(!party.containsKey(i) && !dfsHelper(i, 0)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfsHelper(int node, int binary) {
        if(party.containsKey(node)) {
            return party.get(node) == binary;
        }
        party.put(node, binary);
        for(int neighbor : graph.get(node)) {
            if(!dfsHelper(neighbor, binary ^ 1)) {
                return false;
            }
        }
        return true;
    }
}