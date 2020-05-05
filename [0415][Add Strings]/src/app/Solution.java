package app;

public class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while(i >= 0 || j >= 0 || carry > 0) {
            int x = 0;
            int y = 0;
            if(i >= 0) x = num1.charAt(i) - '0';
            if(j >= 0) y = num2.charAt(j) - '0';

            int sum = x + y + carry;
            carry = sum / 10;
            sum = sum % 10;
            sb.append(sum);

            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}