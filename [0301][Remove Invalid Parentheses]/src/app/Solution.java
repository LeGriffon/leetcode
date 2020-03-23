package app;

import java.util.*;

public class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        removeHelper(s, result, 0, 0, '(', ')');
        return result;
    }

    private void removeHelper(String s, List<String> result, int iStart, int jStart, char openParen, char closeParen) {
        int numOfOpenParen = 0;
        int numOfCloseParen = 0;
        for(int i = iStart; i < s.length(); i++) {
            if(s.charAt(i) == openParen) numOfOpenParen++;
            if(s.charAt(i) == closeParen) numOfCloseParen++;
            if(numOfCloseParen > numOfOpenParen) {
                for(int j = jStart; j <= i; j++) {
                    if(s.charAt(j) == closeParen && (j == 0 || s.charAt(j - 1) != closeParen)) {
                        removeHelper(s.substring(0, j) + s.substring(j + 1, s.length()), result, i, j, openParen, closeParen);
                    }
                }
                return;
            }
        }
        String reversed = new StringBuilder(s).reverse().toString();
        if(openParen == '(') {
            removeHelper(reversed, result, 0, 0, ')', '(');
        }
        else {
            result.add(reversed);
        }
    }
}