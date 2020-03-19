package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Solution obj = new Solution();
        String digits = "23";
        List<String> result = obj.letterCombinations(digits);
        for(String s : result) {
            System.out.println(s);
        }
    }
}