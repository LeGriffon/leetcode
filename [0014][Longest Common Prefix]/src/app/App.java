package app;

public class App {
    public static void main(String[] args) throws Exception {
        String[] strs = {"flower","flow","flight"};
        Solution obj = new Solution();
        String result = obj.longestCommonPrefix(strs);
        System.out.println(result);
    }
}