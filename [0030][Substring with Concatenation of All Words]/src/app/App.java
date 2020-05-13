package app;

import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        Solution obj = new Solution();
        List<Integer> result = obj.findSubstring(s, words);
        System.out.println(result);
    }
}