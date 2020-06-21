class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        if(dungeon == null || dungeon.length == 0 || dungeon[0].length == 0) return 0;
        int n = dungeon.length;
        int m = dungeon[0].length;
        int[][] dp = new int[n][m];
        for(int i = n - 1; i >= 0; i--) {
            for(int j = m - 1; j >= 0; j--) {
                if(i == n - 1 && j == m - 1) {
                    dp[i][j] = Math.max(1, 1 - dungeon[i][j]);
                }
                else if(i == n - 1) {
                    dp[i][j] = Math.max(1, dp[i][j + 1] - dungeon[i][j]);
                }
                else if(j == m - 1) {
                    dp[i][j] = Math.max(1, dp[i + 1][j] - dungeon[i][j]);
                }
                else {
                    dp[i][j] = Math.min(Math.max(1, dp[i + 1][j] - dungeon[i][j]), Math.max(1, dp[i][j + 1] - dungeon[i][j]));
                }
            }
        }
        return dp[0][0];
    }
}