package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String s = "(a)())()";
        Solution obj = new Solution();
        List<String> result = obj.removeInvalidParentheses(s);
        for(String str : result) {
            System.out.println(str);
        }
    }
}