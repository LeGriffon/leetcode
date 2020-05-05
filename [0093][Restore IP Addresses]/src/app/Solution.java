package app;

import java.util.*;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        restore("", s, 0, result);
        return result;
    }

    private void restore(String path, String s, int k, List<String> result) {
        if(s.isEmpty() || k == 4) {
            if(s.isEmpty() && k == 4) {
                result.add(path.substring(1));
            }
            return;
        }
        for(int i = 1; i <= (s.charAt(0) == '0' ? 1 : 3) && i <= s.length(); i++) {
            String part = s.substring(0, i);
            if(Integer.valueOf(part) <= 255) {
                restore(path + "." + part, s.substring(i), k + 1, result);
            }
        }
    }
}