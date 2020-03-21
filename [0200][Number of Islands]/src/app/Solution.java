package app;

public class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) return 0;
        int numOfIslands = 0;
        int rowLength = grid.length;
        int colLength = grid[0].length;
        for(int i = 0; i < rowLength; i++) {
            for(int j = 0; j < colLength; j++) {
                if(grid[i][j] == '1') {
                    numOfIslands++;
                    dfsHelper(i, j, grid);
                }
            }
        }
        return numOfIslands;
    }

    private void dfsHelper(int i, int j, char[][] grid) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        dfsHelper(i + 1, j, grid);
        dfsHelper(i - 1, j, grid);
        dfsHelper(i, j + 1, grid);
        dfsHelper(i, j - 1, grid);
    }
}