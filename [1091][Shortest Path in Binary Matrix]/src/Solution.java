import java.util.*;

class Solution {
    
    private static int[][] directions = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
    
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid == null || grid.length == 0) return -1;
        if (grid[0][0] != 0 || grid[grid.length - 1][grid[0].length - 1] != 0) return -1;
        
        Deque<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0, 0});
        grid[0][0] = 1;
        
        while(!queue.isEmpty()) {
            int[] cell = queue.poll();
            int cellRow = cell[0];
            int cellCol = cell[1];
            int distance = grid[cellRow][cellCol];
            
            if(cellRow == grid.length - 1 && cellCol == grid[0].length - 1) return distance;
            
            for(int[] neighbor : getNeighbors(grid, cellRow, cellCol)) {
                int neighborRow = neighbor[0];
                int neighborCol = neighbor[1];
                queue.offer(new int[]{neighborRow, neighborCol});
                grid[neighborRow][neighborCol] = distance + 1;
            }
        }
        
        return -1;
    }
    
    private List<int[]> getNeighbors(int[][] grid, int cellRow, int cellCol) {
        List<int[]> neighbors = new ArrayList<>();
        for(int[] direction : directions) {
            int neighborRow = cellRow + direction[0];
            int neighborCol = cellCol + direction[1];
            if(neighborRow >= 0 && neighborRow < grid.length && neighborCol >= 0 && neighborCol < grid[0].length && grid[neighborRow][neighborCol] == 0) {
                neighbors.add(new int[] {neighborRow, neighborCol});
            }
        }
        return neighbors;
    }
}