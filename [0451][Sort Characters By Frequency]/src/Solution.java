import java.util.*;

class Solution {
    public String frequencySort(String s) {
        if(s == null || s.length() == 0) return s;
        Map<Character, Integer> counts = new HashMap<>();
        for(char ch : s.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }
        int maxFrequency = Collections.max(counts.values());
        
        List<List<Character>> buckets = new ArrayList<>();
        for(int i = 0; i <= maxFrequency; i++) {
            buckets.add(new ArrayList<>());
        }
        for(char ch : counts.keySet()) {
            buckets.get(counts.get(ch)).add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = maxFrequency; i > 0; i--) {
            for(char ch : buckets.get(i)) {
                for(int j = 0; j < i; j++) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}