package app;

import java.util.*;

public class Solution {
    public int firstUniqChar(String s) {
        if(s == null || s.length() == 0) return -1;
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 1));
        }
        for(int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}