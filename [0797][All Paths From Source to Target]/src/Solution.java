import java.util.*;

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        if(graph == null || graph.length == 0) return result;
        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        backtrack(0, graph, temp, result);
        return result;
    }
    
    private void backtrack(int node, int[][] graph, List<Integer> temp, List<List<Integer>> result) {
        if(node == graph.length - 1) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int neighbor : graph[node]) {
            temp.add(neighbor);
            backtrack(neighbor, graph, temp, result);
            temp.remove(temp.size() - 1);
        }
    }
}