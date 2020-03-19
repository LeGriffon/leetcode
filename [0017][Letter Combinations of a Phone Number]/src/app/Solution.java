package app;

import java.util.*;

public class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> result = new ArrayList<>();
        dfsHelper("", result, map, digits);
        return result;
    }

    private void dfsHelper(String combination, List<String> result, Map<Character, String> map, String digits) {
        if(digits.length() == 0) {
            result.add(combination);
            return;
        }
        char digit = digits.charAt(0);
        String letters = map.get(digit);
        for(int i = 0; i < letters.length(); i++) {
            String letter = String.valueOf(letters.charAt(i));
            dfsHelper(combination + letter, result, map, digits.substring(1));
        }
    }
}