import java.util.*;

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        return wordBreak(s, new HashSet<>(wordDict), new HashMap<>());
    }
    
    private List<String> wordBreak(String s, Set<String> wordDict, Map<String, List<String>> map) {
        if(map.containsKey(s)) {
            return map.get(s);
        }
        List<String> list = new LinkedList<>();
        if(s.length() == 0) {
            list.add("");
            return list;
        }
        
        for(String word : wordDict) {
            if(s.startsWith(word)) {
                List<String> sublist = wordBreak(s.substring(word.length()), wordDict, map);
                for(String sub : sublist) {
                    list.add(word + (sub.isEmpty() ? "" : " ") + sub);
                }
            }
        }
        map.put(s, list);
        return list;
    }
}