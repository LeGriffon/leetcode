package app;

import java.util.*;

public class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int numDecodings(String s) {
        if(s == null || s.length() == 0) return 0;
        return recursiveWithMemo(0, s);
    }

    private int recursiveWithMemo(int index, String s) {
        if(index == s.length()) {
            return 1;
        }
        if(s.charAt(s.length() - 1) == '0') {
            return 0;
        }
        if(index == s.length() - 1) {
            return 1;
        }
        if(map.containsKey(index)) {
            return map.get(index);
        }
        int ans = recursiveWithMemo(index + 1, s);
        if(Integer.valueOf(s.substring(index, index + 2)) <= 26) {
            ans += recursiveWithMemo(index + 2, s);
        }
        map.put(index, ans);
        return ans;
    }
}