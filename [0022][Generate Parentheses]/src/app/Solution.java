package app;

import java.util.*;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        bfsHelper("", result, 0, 0, n);
        return result;
    }

    private void bfsHelper(String combination, List<String> result, int open, int close, int max) {
        if(combination.length() == max * 2) {
            result.add(combination);
            return;
        }
        if(open < max) {
            bfsHelper(combination + '(', result, open + 1, close, max);
        }
        if(close < open) {
            bfsHelper(combination + ')', result, open, close + 1, max);
        }
    }
}