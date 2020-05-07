package app;

public class Solution {
    public String toLowerCase(String str) {
        char[] charArr = str.toCharArray();
        for(int i = 0; i < charArr.length; i++) {
            if(charArr[i] >= 'A' && charArr[i] <= 'Z') {
                charArr[i] = (char) (charArr[i] - 'A' + 'a');
            }
        }
        return String.valueOf(charArr);
    }
}