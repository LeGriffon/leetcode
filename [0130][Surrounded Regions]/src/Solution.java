class Solution {
    public void solve(char[][] board) {
        if(board.length < 3 || board[0].length < 3) return;
        
        int n = board.length;
        int m = board[0].length;
        
        for(int i = 0; i < n; i++) {
            if(board[i][0] == 'O') dfsMarkUncaptured(i, 0, board);
            if(board[i][m - 1] == 'O') dfsMarkUncaptured(i, m - 1, board);
        }
        
        for(int j = 0; j < m; j++) {
            if(board[0][j] == 'O') dfsMarkUncaptured(0, j, board);
            if(board[n - 1][j] == 'O') dfsMarkUncaptured(n - 1, j, board);
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(board[i][j] == 'O') board[i][j] = 'X';
                else if(board[i][j] == '*') board[i][j] = 'O';
            }
        }
        
    }
    
    private void dfsMarkUncaptured(int row, int col, char[][] board) {
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != 'O') return;
        board[row][col] = '*';
        dfsMarkUncaptured(row + 1, col, board);
        dfsMarkUncaptured(row - 1, col, board);
        dfsMarkUncaptured(row, col + 1, board);
        dfsMarkUncaptured(row, col - 1, board);
    }
}