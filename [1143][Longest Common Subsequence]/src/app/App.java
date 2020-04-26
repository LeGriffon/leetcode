package app;

public class App {
    public static void main(String[] args) throws Exception {
        String text1 = "abcde", text2 = "ace";
        Solution obj = new Solution();
        int result = obj.longestCommonSubsequence(text1, text2);
        System.out.println(result);
    }
}