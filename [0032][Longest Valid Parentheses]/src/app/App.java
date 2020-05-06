package app;

public class App {
    public static void main(String[] args) throws Exception {
        String s = ")()())";
        Solution obj = new Solution();
        int result = obj.longestValidParentheses(s);
        System.out.println(result);
    }
}