package app;

public class Solution {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int result = words.length;
        int index1 = result, index2 = -result;
        for(int i = 0; i < words.length; i++) {
            if(words[i].equals(word1)) {
                index1 = i;
            }
            if(words[i].equals(word2)) {
                if(word1.equals(word2)) {
                    index1 = index2;
                }
                index2 = i;
            }
            result = Math.min(result, Math.abs(index1 - index2));
        }
        return result;
    }
}