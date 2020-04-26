package app;

public class App {
    public static void main(String[] args) throws Exception {
        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding", word2 = "practice";
        WordDistance obj = new WordDistance(words);
        int result = obj.shortest(word1, word2);
        System.out.println(result);
    }
}