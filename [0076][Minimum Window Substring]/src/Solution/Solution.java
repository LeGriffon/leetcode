package Solution;

import java.util.*;

public class Solution {
    public String minWindow(String s, String t) {
        if(s.length() == 0 || t.length() == 0) return "";
        Map<Character, Integer> dict = new HashMap<>();
        for(int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            int count = dict.getOrDefault(i, 0);
            dict.put(ch, count + 1);
        }
        
        int required = dict.size();
        int l = 0, r = 0, formed = 0;
        // result store current optimal formed length, left pointer index, right pointer index;
        int[] result = {-1, 0, 0};
        Map<Character, Integer> windowCount = new HashMap<>();
        while(r < s.length()) {
            char ch = s.charAt(r);
            int count = windowCount.getOrDefault(r, 0);
            windowCount.put(ch, count + 1);
            if(dict.containsKey(ch) && (dict.get(ch).intValue() == windowCount.get(ch).intValue())) {
                formed++;
            }
            while(l <= r && formed == required) {
                if(result[0] == -1 || result[0] > r - l + 1) {
                    result[0] = r - l + 1;
                    result[1] = l;
                    result[2] = r;
                }
                char c = s.charAt(l);
                windowCount.put(c, windowCount.get(c) - 1);
                if(dict.containsKey(c) && (dict.get(c).intValue() > windowCount.get(c).intValue())) {
                    formed--;
                }
                l++;
            }
            r++;
        }
        return result[0] == -1 ? "" : s.substring(result[1], result[2] + 1);
    }
}