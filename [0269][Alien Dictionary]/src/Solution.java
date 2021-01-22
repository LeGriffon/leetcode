import java.util.*;

class Solution {
    public String alienOrder(String[] words) {
        Map<Character, List<Character>> graph = new HashMap<>();
        Map<Character, Integer> indegree = new HashMap<>();
        
        for(String word : words) {
            for(char ch : word.toCharArray()) {
                graph.putIfAbsent(ch, new ArrayList<>());
                indegree.putIfAbsent(ch, 0);
            }
        }
        
        for(int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            
            if(word1.length() > word2.length() && word1.startsWith(word2)) return "";
            
            for(int j = 0; j < Math.min(word1.length(), word2.length()); j++) {
                if(word1.charAt(j) != word2.charAt(j)) {
                    graph.get(word1.charAt(j)).add(word2.charAt(j));
                    indegree.put(word2.charAt(j), indegree.get(word2.charAt(j)) + 1);
                    break;
                }
            }
        }
            
        StringBuilder sb = new StringBuilder();
        Deque<Character> queue = new LinkedList<>();

        for(Character ch : indegree.keySet()) {
            if(indegree.get(ch).equals(0)) {
                queue.addLast(ch);
            }
        }

        while(!queue.isEmpty()) {
            char ch = queue.removeFirst();
            sb.append(ch);
            for(char neighbor : graph.get(ch)) {
                indegree.put(neighbor, indegree.get(neighbor) - 1);
                if(indegree.get(neighbor).equals(0)) {
                    queue.addLast(neighbor);
                }
            }
        }
        
        if(sb.length() < indegree.size()) return "";

        return sb.toString();
    }
}