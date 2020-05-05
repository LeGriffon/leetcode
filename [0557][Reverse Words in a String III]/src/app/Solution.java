package app;

public class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            for(int j = charArray.length - 1; j >= 0; j--) {
                sb.append(charArray[j]);
            }
            sb.append(" ");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}