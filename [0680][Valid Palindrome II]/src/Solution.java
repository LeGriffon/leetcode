class Solution {
    public boolean validPalindrome(String s) {
        for(int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
                int j = s.length() - i - 1;
                return (isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1));
            }
        }
        return true;
    }
    
    private boolean isPalindrome(String s, int i, int j) {
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}