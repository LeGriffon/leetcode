class Solution {
    private static final int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    private int rows, cols;
    
    public int longestIncreasingPath(int[][] matrix) {        
        if(matrix == null || matrix.length == 0) return 0;
        int result = 0;
        rows = matrix.length; 
        cols = matrix[0].length;
        int[][] cache = new int[rows][cols];
        for(int row = 0; row < rows; row++) {
            for(int col = 0; col < cols; col++) {
                result = Math.max(result, dfs(row, col, matrix, cache));
            }
        }
        return result;
    }
    
    private int dfs(int row, int col, int[][] matrix, int[][] cache) {
        if(cache[row][col] != 0) return cache[row][col];
        for(int[] direction : directions) {
            int x = row + direction[0];
            int y = col + direction[1];
            if(x >= 0 && x < rows && y >= 0 && y < cols && matrix[x][y] > matrix[row][col]) {
                cache[row][col] = Math.max(cache[row][col], dfs(x, y, matrix, cache));
            }
        }
        return ++cache[row][col];
    }
}