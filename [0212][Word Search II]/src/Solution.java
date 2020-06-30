import java.util.*;

public class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        if(board == null || board.length == 0 || words == null || words.length == 0) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        TrieNode root = constructTrie(words);
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                backtrack(i, j, board, root, result);
            }
        }
        return result;
    }
    
    private void backtrack(int i, int j, char[][] board, TrieNode node, List<String> result) {
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == '#' || !node.containsKey(board[i][j])) return;
        char ch = board[i][j];
        node = node.get(ch);
        if(node.containsWord()) {
            result.add(node.getWord());
            node.setWord(null);
        }
        board[i][j] = '#';
        backtrack(i + 1, j, board, node, result);
        backtrack(i - 1, j, board, node, result);
        backtrack(i, j + 1, board, node, result);
        backtrack(i, j - 1, board, node, result);
        board[i][j] = ch;
    }
    
    private TrieNode constructTrie(String[] words) {
        TrieNode root = new TrieNode();
        for(String word : words) {
            TrieNode node = root;
            for(char ch : word.toCharArray()) {
                if(!node.containsKey(ch)) {
                    node.put(ch, new TrieNode());
                }
                node = node.get(ch);
            }
            node.setWord(word);
        }
        return root;
    }
}