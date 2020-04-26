package app;

public class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int index1 = -1, index2 = -1;
        int result = words.length;
        for(int i = 0; i < words.length; i++) {
            if(words[i].equals(word1)) {
                index1= i;
            }
            else if(words[i].equals(word2)) {
                index2 = i;
            }
            if(index1 != -1 && index2 != -1) {
                result = Math.min(result, Math.abs(index1 - index2));
            }
        }
        return result;
    }
}