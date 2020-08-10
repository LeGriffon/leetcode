import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        Deque<int[]> queue = new LinkedList<>();
        int freshOranges = 0;
        int minutes = -1;
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    freshOranges++;
                }
                else if(grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        queue.offer(new int[]{-1, -1});
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        
        while(!queue.isEmpty()) {
            int[] rottenCoordinate = queue.poll();
            int row = rottenCoordinate[0];
            int col = rottenCoordinate[1];
            
            if(row == -1) {
                minutes++;
                if(!queue.isEmpty()) {
                    queue.offer(new int[]{-1, -1});
                }
            }
            else {
                for(int[] d : directions) {
                    int neightborRow = row + d[0];
                    int neightborCol = col + d[1];
                    if(neightborRow >= 0 && neightborRow < grid.length && neightborCol >= 0 && neightborCol < grid[0].length) {
                        if(grid[neightborRow][neightborCol] == 1) {
                            freshOranges--;
                            grid[neightborRow][neightborCol] = 2;
                            queue.offer(new int[]{neightborRow, neightborCol});
                        }
                    }
                }
            }
        }
        return freshOranges == 0 ? minutes : -1;
    }
}