import java.util.*;

public class Solution {
	/*
	 * Using basic backtracking depth-first search to find all the possible
	 * solutions. isValid function only checks diagonal attack: as we are going in
	 * increasing order of columns to place a queen in each of them, we need to only
	 * check the diagonal left top and diagonal left bottom(no need to check
	 * diagonal right top and diagonal right bottom). Hence to check left top x - i
	 * = y - j and to check left bottom i - x = y - j which can be modified to x + j
	 * = y + i and x + y = i + j
	 */
	public List<List<String>> solveNQueens(int n) {
		List<List<String>> list = new ArrayList<>();
		char[][] board = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = '.';
			}
		}
		dfs(board, list, 0);
		return list;
	}

	private void dfs(char[][] board, List<List<String>> list, int colIndex) {
		if (colIndex == board.length) {
			list.add(constructBoard(board));
			return;
		}
		for (int row = 0; row < board.length; row++) {
			if (isValid(board, row, colIndex)) {
				board[row][colIndex] = 'Q';
				dfs(board, list, colIndex + 1);
				board[row][colIndex] = '.';
			}
		}
	}

	private List<String> constructBoard(char[][] board) {
		List<String> res = new ArrayList<>();
		for (int row = 0; row < board.length; row++) {
			String s = new String(board[row]);
			res.add(s);
		}
		return res;
	}

	private boolean isValid(char[][] board, int row, int colIndex) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < colIndex; j++) {
				if (board[i][j] == 'Q' && (row - i == colIndex - j || i - row == colIndex - j || row == i)) {
					return false;
				}
			}
		}
		return true;
	}
}
