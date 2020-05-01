package app;

public class App {
    public static void main(String[] args) throws Exception {
        String s = "  the sky is  blue ";
        Solution obj = new Solution();
        String result = obj.reverseWords(s);
        System.out.println(result);
    }
}