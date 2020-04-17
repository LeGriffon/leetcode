package app;

public class Solution {
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0) return false;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(backtracking(i, j, board, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtracking(int i, int j, char[][] board, String word, int index) {
        if(index == word.length()) return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }
        board[i][j] = '*';
        boolean exist = backtracking(i + 1, j, board, word, index + 1) ||
                        backtracking(i - 1, j, board, word, index + 1) ||
                        backtracking(i, j + 1, board, word, index + 1) ||
                        backtracking(i, j - 1, board, word, index + 1);
        board[i][j] = word.charAt(index);
        return exist;
    }
}