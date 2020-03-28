package app;

import java.util.*;

public class Solution {
    public int shortestBridge(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        boolean[][] visited = new boolean[rows][cols];
        Queue<int[]> queue = new LinkedList<>();
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        boolean foundFirst = false;

        for(int i = 0; i < rows && !foundFirst; i++) {
            for(int j = 0; j < cols && !foundFirst; j++) {
                if(A[i][j] == 1) {
                    dfsHelper(i, j, A, visited, queue, dirs);
                    foundFirst = true;
                }
            }
        }

        int flipCount = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                for(int[] dir : dirs) {
                    int x = cell[0] + dir[0];
                    int y = cell[1] + dir[1];
                    if(x >= 0 && y >= 0 && x < rows && y < cols && !visited[x][y]) {
                        if(A[x][y] == 1) {
                            return flipCount;
                        }
                        else {
                            queue.offer(new int[] {x, y});
                            visited[x][y] = true;
                        }
                    }
                }
            }
            flipCount++;
        }
        return -1;
    }

    private void dfsHelper(int x, int y, int[][] A, boolean[][] visited, Queue<int[]> queue, int[][] dirs) {
        if(x < 0 || x >= A.length || y < 0 || y >= A[0].length || A[x][y] == 0) {
            return;
        }
        visited[x][y] = true;
        queue.offer(new int[] {x, y});
        for(int[] dir : dirs) {
            dfsHelper(x + dir[0], y + dir[1], A, visited, queue, dirs);
        }
    }
}