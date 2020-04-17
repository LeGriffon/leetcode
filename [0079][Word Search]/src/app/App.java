package app;

public class App {
    public static void main(String[] args) throws Exception {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";
        Solution obj = new Solution();
        boolean result = obj.exist(board, word);
        System.out.println(result);
    }
}