import java.util.*;

class Solution {
    int[][] grid;
    boolean [][] seen;
    StringBuilder currentIsland;
    
    public int numDistinctIslands(int[][] grid) {
        this.grid = grid;
        this.seen = new boolean[grid.length][grid[0].length];
        Set<String> uniqueIslands = new HashSet<>();
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                currentIsland = new StringBuilder();
                dfsHelper(i, j, "0");
                if(currentIsland.length() != 0) uniqueIslands.add(currentIsland.toString());
            }
        }
        return uniqueIslands.size();
    }
    
    private void dfsHelper(int row, int col, String dir) {
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) return;
        if(seen[row][col] || grid[row][col] == 0) return;
        seen[row][col] = true;
        currentIsland.append(dir);
        dfsHelper(row + 1, col, "D");
        dfsHelper(row - 1, col, "U");
        dfsHelper(row, col + 1, "R");
        dfsHelper(row, col - 1, "L");
        currentIsland.append("0");
    }
}