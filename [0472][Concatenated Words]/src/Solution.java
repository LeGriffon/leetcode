import java.util.*;

class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> result = new ArrayList<>();
        Set<String> wordsSet = new HashSet<>(Arrays.asList(words));
        Map<String, Boolean> cache = new HashMap<>();
        for(String word : words) {
            if(dfsHelper(word, wordsSet, cache)) {
                result.add(word);
            }
        }
        return result;
    }
    
    private boolean dfsHelper(String word, Set<String> wordsSet, Map<String, Boolean> cache) {
        if(cache.containsKey(word)) return cache.get(word);
        for(int i = 1; i < word.length(); i++) {
            if(wordsSet.contains(word.substring(0, i))) {
                String suffix = word.substring(i);
                if(wordsSet.contains(suffix) || dfsHelper(suffix, wordsSet, cache)) {
                    cache.put(word, true);
                    return true;
                }
            }
        }
        cache.put(word, false);
        return false;
    }
}