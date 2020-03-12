package app;
import Solution.*;

public class App {
    public static void main(String[] args) throws Exception {
        Solution obj = new Solution();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = obj.minWindow(s, t);
        System.out.println(result);
    }
}