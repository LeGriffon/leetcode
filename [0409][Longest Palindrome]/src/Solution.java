class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for(char ch : s.toCharArray()) {
            count[ch]++;
        }
        
        int result = 0;
        for(int c : count) {
            result += c / 2 * 2;
            if(result % 2 == 0 && c % 2 == 1) {
                result++;
            }
        }
        return result;
    }
}