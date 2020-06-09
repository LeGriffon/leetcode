class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        int sPtr = 0;
        int tPtr = 0;
        while(sPtr < sLength && tPtr < tLength) {
            if(s.charAt(sPtr) == t.charAt(tPtr)) {
                sPtr++;
            }
            tPtr++;
        }
        return sPtr == sLength;
    }
}