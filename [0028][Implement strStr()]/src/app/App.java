package app;

public class App {
    public static void main(String[] args) throws Exception {
        String haystack = "hello", needle = "ll";
        Solution obj = new Solution();
        int result = obj.strStr(haystack, needle);
        System.out.println(result);
    }
}