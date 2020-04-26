package app;

public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1.length() > text2.length()) {
            String temp = text1;
            text1 = text2;
            text2 = temp;
        }
        int[] previous = new int[text1.length() + 1];
        for(int col = text2.length() - 1; col >= 0; col--) {
            int[] current = new int[text1.length() + 1];
            for(int row = text1.length() - 1; row >= 0; row--) {
                if(text1.charAt(row) == text2.charAt(col)) {
                    current[row] = 1 + previous[row + 1];
                }
                else {
                    current[row] = Math.max(current[row + 1], previous[row]);
                }
            }
            previous = current;
        }
        return previous[0];
    }
}