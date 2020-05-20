class Solution {
    int[] mapping = new int[26];
    public boolean isAlienSorted(String[] words, String order) {
        for(int i = 0; i < order.length(); i++) {
            mapping[order.charAt(i) - 'a'] = i;
        }
        for(int i = 1; i < words.length; i++) {
            if(larger(words[i - 1], words[i])) {
                return false;
            }
        }
        return true;
    }
    
    private boolean larger(String s1, String s2) {
        int lengthS1 = s1.length();
        int lengthS2 = s2.length();
        for(int i = 0; i < lengthS1 && i < lengthS2; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch1 != ch2) {
                 return mapping[ch1 - 'a'] > mapping[ch2 - 'a'];
            }
        }
        return lengthS1 > lengthS2;
    }
}