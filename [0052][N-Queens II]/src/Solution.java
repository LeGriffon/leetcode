class Solution {
    private int result = 0;
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        dfsHelper(board, 0);
        return result;
    }
    
    private void dfsHelper(char[][] board, int colIndex) {
        if(colIndex == board.length) {
            result++;
        }
        for(int i = 0; i < board.length; i++) {
            if(validate(board, i, colIndex)) {
                board[i][colIndex] = 'Q';
                dfsHelper(board, colIndex + 1);
                board[i][colIndex] = '.';
            }
        }
    }
    
    private boolean validate(char[][] board, int x, int y) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < y; j++) {
                if(board[i][j] == 'Q' &&(i + j == x + y || i - j == x - y || x == i || y == j)) return false;
            }
        }
        return true;
    }
}