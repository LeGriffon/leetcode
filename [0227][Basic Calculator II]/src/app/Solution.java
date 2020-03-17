package app;

import java.util.*;

public class Solution {
    public int calculate(String s) {
        if(s == null || s.length() == 0) return 0;
        int operand = 0;
        char sign = '+';
        Deque<Integer> stack = new LinkedList<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                operand = operand * 10 + (ch - '0');
            }
            if((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
                if(sign == '+') {
                    stack.push(operand);
                }
                else if(sign == '-') {
                    stack.push(-operand);
                }
                else if(sign == '*') {
                    stack.push(stack.pop() * operand);
                }
                else if(sign == '/') {
                    stack.push(stack.pop() / operand);
                }
                operand = 0;
                sign = ch;
            }
        }
        int result = 0;
        for(int n : stack) {
            result += n;
        }
        return result;
    }
}