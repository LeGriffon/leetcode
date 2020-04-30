package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Solution obj = new Solution();
        List<String> result = obj.generateParenthesis(3);
        for(String s : result) {
            System.out.println(s);
        }
    }
}