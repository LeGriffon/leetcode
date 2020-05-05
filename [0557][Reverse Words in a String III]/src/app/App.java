package app;

public class App {
    public static void main(String[] args) throws Exception {
        String s = "Let's take LeetCode contest";
        Solution obj = new Solution();
        String result = obj.reverseWords(s);
        System.out.println(result);
    }
}