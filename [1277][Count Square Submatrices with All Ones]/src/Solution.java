class Solution {
    public int countSquares(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] dp = new int[cols + 1];
        int count = 0, prev = 0;
        for(int row = 1; row <= rows; row++) {
            for(int col = 1; col <= cols; col++) {
                int temp = dp[col];
                if(matrix[row - 1][col - 1] == 1) {
                    dp[col] = Math.min(prev, Math.min(dp[col - 1], dp[col])) + 1;
                    count += dp[col]; 
                }
                else {
                    dp[col] = 0;
                }
                prev = temp;
            }
        }
        return count;
    }
}