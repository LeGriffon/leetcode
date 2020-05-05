package app;

class Solution {
    public String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        for(int start = 0; start < charArray.length; start += 2 * k) {
            int left = start;
            int right = Math.min(start + k - 1, charArray.length - 1);
            while(left < right) {
                char temp = charArray[left];
                charArray[left++] = charArray[right];
                charArray[right--] = temp;
            }
        }
        return String.valueOf(charArray);
    }
}