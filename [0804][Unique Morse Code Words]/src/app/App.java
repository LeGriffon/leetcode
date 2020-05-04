package app;

public class App {
    public static void main(String[] args) throws Exception {
        String[] words = {"gin", "zen", "gig", "msg"};
        Solution obj = new Solution();
        int result = obj.uniqueMorseRepresentations(words);
        System.out.println(result);
    }
}