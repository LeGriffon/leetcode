package app;

public class App {
    public static void main(String[] args) throws Exception {
        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding", word2 = "practice";
        Solution obj = new Solution();
        int result = obj.shortestDistance(words, word1, word2);
        System.out.println(result);
    }
}