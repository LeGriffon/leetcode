package app;

public class Solution {
    public boolean isMatch(String s, String p) {
        int rows = s.length();
        int cols = p.length();
        boolean[][] dp = new boolean[rows + 1][cols + 1];
        dp[rows][cols] = true;
        for(int i = rows; i >= 0; i--) {
            for(int j = cols - 1; j >= 0; j--) {
                boolean first_match = i < rows && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
                if(j + 1 < cols && p.charAt(j + 1) == '*') {
                    dp[i][j] = dp[i][j + 2] ||  (first_match && dp[i + 1][j]);
                }
                else {
                    dp[i][j] = first_match && dp[i + 1][j + 1];
                }
            }
        }
        return dp[0][0];
    }
}