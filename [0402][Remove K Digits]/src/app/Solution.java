package app;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new LinkedList<>();
        if(num.length() == k) return "0";
        for(char digit : num.toCharArray()) {
            while(k > 0 && !stack.isEmpty() && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        while(k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        while(sb.length() != 0 && sb.charAt(sb.length() - 1) == '0') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.length() == 0 ? "0" : sb.reverse().toString();
    }
}