package app;

public class App {
    public static void main(String[] args) throws Exception {
        String s = "aab";
        String p = "c*a*b";
        Solution obj = new Solution();
        boolean result = obj.isMatch(s, p);
        System.out.println(result);
    }
}