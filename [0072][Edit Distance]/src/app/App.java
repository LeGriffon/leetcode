package app;

public class App {
    public static void main(String[] args) throws Exception {
        String word1 = "horse", word2 = "ros";
        Solution obj = new Solution();
        int result = obj.minDistance(word1, word2);
        System.out.println(result);
    }
}