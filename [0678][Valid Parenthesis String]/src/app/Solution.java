package app;

public class Solution {
    public boolean checkValidString(String s) {
        int left = 0, right = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                left++;
                right++;
            }
            else if(ch == ')') {
                if(right > 0) {
                    right--;
                }
                left--;
            }
            else {
                if(right > 0) {
                    right--;
                }
                left++;
            }
            if(left < 0) {
                return false;
            }
        }
        return right == 0;
    }
}