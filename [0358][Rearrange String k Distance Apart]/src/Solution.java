import java.util.*;

class Solution {
    public String rearrangeString(String s, int k) {
        if(s == null || s.length() == 0) return "";
        if(k == 0) return s;
        
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        Queue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));
        pq.addAll(map.entrySet());
        
        Deque<Map.Entry<Character, Integer>> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            if(pq.isEmpty()) {
                return "";
            }
            Map.Entry<Character, Integer> entry = pq.poll();
            sb.append(entry.getKey());
            entry.setValue(entry.getValue() - 1);
            queue.offer(entry);
            
            if(queue.size() == k) {
                Map.Entry<Character, Integer> poll = queue.poll();
                if(poll.getValue() > 0) {
                    pq.offer(poll);
                }
            }
        }
        return sb.toString();
    }
}