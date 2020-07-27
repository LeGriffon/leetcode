class Solution {
    public boolean isOneEditDistance(String s, String t) {
        if(s.equals(t)) return false;
        if(s.length() == 0 && t.length() == 0) return false;
        if(Math.abs(s.length() - t.length()) > 1) return false;
        
        String s1 = s.length() > t.length() ? t : s;
        String s2 = s.length() > t.length() ? s : t;
        
        boolean foundDifference = false;
        int index1 = 0, index2 = 0;
        while(index1 < s1.length() && index2 < s2.length()) {
            if(s1.charAt(index1) != s2.charAt(index2)) {
                if(foundDifference) {
                    return false;
                }
                foundDifference = true;
                if(s1.length() == s2.length()) {
                    index1++;
                }
            }
            else {
                index1++;
            }
            index2++;
        }
        return true;
    }
}