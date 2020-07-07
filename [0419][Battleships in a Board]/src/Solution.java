class Solution {
    public int countBattleships(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        
        int result = 0;
        
        for(int row = 0; row < rows; row++) {
            for(int col = 0; col < cols; col++) {
                if(board[row][col] == '.') continue;
                if(row > 0 && board[row - 1][col] == 'X') continue;
                if(col > 0 && board[row][col - 1] == 'X') continue;
                result++;
            }
        }
        return result;
    }
}