package app;

public class App {
    public static void main(String[] args) throws Exception {
        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "makes", word2 = "makes";
        Solution obj = new Solution();
        int result = obj.shortestWordDistance(words, word1, word2);
        System.out.println(result);
    }
}