package app;

public class Solution {
    String[] less_than_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String[] thousands = {"", "Thousand", "Million", "Billion"}; 
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        String word = "";
        int i = 0;
        while(num > 0) {
            if(num % 1000 != 0) {
                word = helper(num%1000) + thousands[i] + " " + word;
            }
            num /= 1000;
            i++;
        }
        return word.trim();
    }

    private String helper(int num) {
        if(num == 0) {
            return "";
        }
        if(num < 20) {
            return less_than_20[num] + " ";
        }
        if(num < 100) {
            return tens[num/10] + " " + helper(num%10);
        }
        else {
            return less_than_20[num/100] + " Hundred " + helper(num%100);
        }

    }
}