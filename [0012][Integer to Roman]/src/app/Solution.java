package app;

public class Solution {
    public String intToRoman(int num) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();
        int index = 0;

        while(num > 0) {
            int quotient = num / nums[index];
            num -= quotient * nums[index];
            while(quotient > 0) {
                sb.append(roman[index]);
                quotient--;
            }
            index++;
        }
        return sb.toString();
    }
}