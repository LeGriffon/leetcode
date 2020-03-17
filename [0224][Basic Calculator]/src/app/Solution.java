package app;

import java.util.*;

public class Solution{
    public int calculate(String s) {
        if(s == null || s.length() == 0) return 0;
        int sign = 1;
        int result = 0;
        int operand = 0;
        Deque<Integer> stack = new LinkedList<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                operand = operand * 10 + (ch - '0');
            }
            else if(ch == '+') {
                result +=  sign * operand;
                sign = 1;
                operand = 0;
            }
            else if(ch == '-') {
                result += sign * operand;
                sign = -1;
                operand = 0;
            }
            else if(ch == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            }
            else if(ch == ')') {
                result += sign * operand;
                result *= stack.pop();
                result += stack.pop();
                operand = 0;
            }
        }
        return result + (sign * operand);
    }
}