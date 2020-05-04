package app;

import java.util.*;

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> seen = new HashSet<>();
        for(String word : words) {
            StringBuilder sb = new StringBuilder();
            for(char ch : word.toCharArray()) {
                sb.append(morse[ch - 'a']);
            }
            seen.add(sb.toString());
        }
        return seen.size();
    }
}