package app;

import java.util.*;

public class WordDistance {
    
    private Map<String, List<Integer>> map;
    
    public WordDistance(String[] words) {
        this.map = new HashMap<>();
        for(int i = 0; i < words.length; i++) {
            map.computeIfAbsent(words[i], k -> new ArrayList<>()).add(i);
        }
    }
    
    public int shortest(String word1, String word2) {
        List<Integer> list1 = map.get(word1);
        List<Integer> list2 = map.get(word2);
        int result = Integer.MAX_VALUE;
        for(int i = 0, j = 0; i < list1.size() && j < list2.size();) {
            int index1 = list1.get(i);
            int index2 = list2.get(j);
            if(index1 > index2) {
                result = Math.min(result, index1 - index2);
                j++;
            }
            else {
                result = Math.min(result, index2 - index1);
                i++;
            }
        }
        return result;
    }
}