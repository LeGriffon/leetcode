import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        char[][] board = {
            {'o', 'a', 'a', 'n'},
            {'e', 't', 'a', 'e'},
            {'i', 'h', 'k', 'r'},
            {'i', 'f', 'l', 'v'}
        };
        String[] words = {"oath", "pea", "eat", "rain"};
        Solution obj = new Solution();
        List<String> result = obj.findWords(board, words);
        System.out.println(result);
    }
}
