package app;

public class App {
    public static void main(String[] args) throws Exception {
        String s = "abcaaa";
        Solution obj = new Solution();
        int result = obj.countSubstrings(s);
        System.out.println(result);
    }
}