package app;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        if(s == null || s.length() == 0 || words == null || words.length == 0) return new ArrayList<>();
        Map<String, Integer> counts = new HashMap<>();
        for(String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        int wordsSize = words.length;
        int wordLength = words[0].length();
        int stringLength = s.length();
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < stringLength - wordsSize * wordLength + 1; i++) {
            String subWord = s.substring(i, i + wordsSize * wordLength);
            if(isConcate(subWord, counts, wordLength)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isConcate(String subWord, Map<String, Integer> counts, int wordLength) {
        Map<String, Integer> seen = new HashMap<>();
        for(int i = 0; i < subWord.length(); i += wordLength) {
            String seenCheck = subWord.substring(i, i + wordLength);
            if(counts.containsKey(seenCheck)) {
                seen.put(seenCheck, seen.getOrDefault(seenCheck, 0) + 1);
            }
        }
        return seen.equals(counts);
    }
}