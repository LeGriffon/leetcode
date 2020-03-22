package app;

import java.util.*;

public class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        Map<String, List<String>> graph = new HashMap<>();
        List<String> path = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        buildGraph(beginWord, endWord, dict, graph);
        dfsHelper(beginWord, endWord, graph, path, result);
        return result;
    }

    private void buildGraph(String start, String end, Set<String> dict, Map<String, List<String>> graph) {
        Deque<String> queue = new LinkedList<>();
        List<String> toVisit = new ArrayList<>();
        List<String> visited = new ArrayList<>();
        boolean foundEnd = false;
        queue.offer(start);
        while(!queue.isEmpty()) {
            visited.addAll(toVisit);
            toVisit.clear();
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                String curr = queue.poll();
                if(curr.equals(end)) {
                    foundEnd = true;
                }
                List<String> neighbors = findNeighbors(curr, dict);
                for(String neighbor : neighbors) {
                    if(!visited.contains(neighbor)) {
                        graph.computeIfAbsent(neighbor, k -> new ArrayList<>()).add(neighbor);
                        if(!toVisit.contains(neighbor)) {
                            toVisit.add(neighbor);
                            queue.offer(neighbor);
                        }
                    }
                }
            }
            if(foundEnd) {
                break;
            }
        }
    }

    private List<String> findNeighbors(String curr, Set<String> dict) {
        List<String> neighbors = new ArrayList<>();
        char[] charArr = curr.toCharArray();
        for(int i = 0; i < charArr.length; i++) {
            for(char ch = 'a'; ch <= 'z'; ch++) {
                char oldChar = charArr[i];
                if(oldChar == ch) continue;
                charArr[i] = ch;
                String newWord = String.valueOf(charArr);
                if(dict.contains(newWord)) {
                    neighbors.add(newWord);
                }
            }
        }
        return neighbors;
    }

    private void dfsHelper(String curr, String end, Map<String, List<String>> graph, List<String> path, List<List<String>> result) {
        path.add(curr);
        if(curr.equals(end)) {
            result.add(new ArrayList<>(path));
        }
        else if (graph.containsKey(curr)) {
            List<String> neighbors = graph.get(curr);
            for(String neighbor : neighbors) {
                dfsHelper(neighbor, end, graph, path, result);
            }
        }
        path.remove(path.size() - 1);
    }
}