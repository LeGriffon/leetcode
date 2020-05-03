package app;

public class Solution {
    public int myAtoi(String str) {
        if(str == null || str.length() == 0) return 0;
        str = str.trim();
        if(str.length() == 0) return 0;
        int sign = 1;
        int start = 0;
        long result = 0;
        if(str.charAt(0) == '+') {
            sign = 1;
            start++;
        }
        if(str.charAt(0) == '-') {
            sign = -1;
            start++;
        }
        for(int i = start; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))) {
                return (int) result * sign;
            }
            result = result * 10 + str.charAt(i) - '0';
            if(result > Integer.MAX_VALUE && sign == 1) return Integer.MAX_VALUE;
            if(result > Integer.MAX_VALUE && sign == -1) return Integer.MIN_VALUE;
        }
        return (int) result * sign;
    }
}