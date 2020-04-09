package app;

public class Solution {
    public void gameOfLife(int[][] board) {
        int[] directions = {0, 1, -1};
        int rows = board.length;
        int cols = board[0].length;
        for(int row = 0; row < rows; row++) {
            for(int col = 0; col < cols; col++) {
                int liveNeighbors = 0;
                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++) {
                        if(i == 0 && j == 0) continue;
                        int r = row + directions[i];
                        int c = col + directions[j];
                        if(r >= 0 && r < rows && c >= 0 && c < cols && Math.abs(board[r][c]) == 1) {
                            liveNeighbors++;
                        }
                    }
                }
                if(board[row][col] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[row][col] = -1;
                }
                else if(board[row][col] == 0 && liveNeighbors == 3) {
                    board[row][col] = 2;
                }
            }
        }
        for(int row = 0; row < rows; row++) {
            for(int col = 0; col < cols; col++) {
                if(board[row][col] > 1) {
                    board[row][col] = 1;
                }
                else if(board[row][col] < 0) {
                    board[row][col] = 0;
                }
            }
        }
    }
}