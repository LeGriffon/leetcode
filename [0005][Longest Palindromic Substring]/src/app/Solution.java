package app;

public class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) return "";
        int left = 0, right = 0;
        for(int i = 0; i < s.length(); i++) {
            int[] len1 = expandAroundCenter(s, i, i);
            int[] len2 = expandAroundCenter(s, i, i + 1);
            int[] len = len1[0] > len2[0] ? len1 : len2;
            if(len[0] > right - left + 1) {
                left = len[1];
                right = len[2];
            }
        }
        return s.substring(left, right + 1);
    }

    private int[] expandAroundCenter(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        left++;
        right--;
        return new int[]{right - left + 1, left, right};
    }
}