package app;

import java.util.*;

public class Solution {
    public void wallsAndGates(int[][] rooms) {
        if(rooms == null || rooms.length == 0 || rooms[0].length == 0) return;
        Deque<int[]> queue = new LinkedList<>();
        for(int i = 0; i < rooms.length; i++) {
            for(int j = 0; j < rooms[0].length; j++) {
                if(rooms[i][j] == 0) {
                    queue.offer(new int[] {i, j});
                }
            }
        }
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while(!queue.isEmpty()) {
            int[] currPosition = queue.poll();
            for(int[] dirction : directions) {
                int row = currPosition[0] + dirction[0];
                int col = currPosition[1] + dirction[1];
                if(row < 0 || row >= rooms.length || col < 0 || col >= rooms[0].length || rooms[row][col] != Integer.MAX_VALUE) continue;
                rooms[row][col] = rooms[currPosition[0]][currPosition[1]] + 1;
                queue.offer(new int[]{row, col});
            }
        }
    }
}