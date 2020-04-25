package app;

import java.util.*;

public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Deque<String> queue = new LinkedList<>();
        Set<String> dict = new HashSet<>(wordList);
        Set<String> visited = new HashSet<>();
        queue.offer(beginWord);
        visited.add(beginWord);

        for(int result = 1; !queue.isEmpty(); result++) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                String word = queue.poll();
                if(word.equals(endWord)) return result;
                for(int j = 0; j < word.length(); j++) {
                    char[] ch = word.toCharArray();
                    for(char c = 'a'; c <= 'z'; c++) {
                        if(c == word.charAt(j)) continue;
                        ch[j] = c;
                        String candidate = String.valueOf(ch);
                        if(dict.contains(candidate) && !visited.contains(candidate)) {
                            queue.offer(candidate);
                            visited.add(candidate);
                        }
                    }
                }
            }
        }
        return 0;
    }
}