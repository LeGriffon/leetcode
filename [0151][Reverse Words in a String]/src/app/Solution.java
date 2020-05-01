package app;

import java.util.*;

public class Solution {
    public String reverseWords(String s) {
        Deque<String> stack = new LinkedList<>();
        int left = 0, right = s.length() - 1;
        while(left < right && s.charAt(left) == ' ') left++;
        while(left < right && s.charAt(right) == ' ') right--;
        StringBuilder sb = new StringBuilder();

        while(left <= right) {
            char ch = s.charAt(left);
            if(sb.length() != 0 && ch == ' ') {
                stack.push(sb.toString());
                sb.setLength(0);
            }
            else if(ch != ' ') {
                sb.append(ch);
            }
            left++;
        }
        stack.push(sb.toString());
        return String.join(" ", stack);
    }
}