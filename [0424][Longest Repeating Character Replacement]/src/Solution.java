class Solution {
    public int characterReplacement(String s, int k) {
        int[] counts = new int[26];
        int historicMax = 0;
        int start = 0;
        
        for(int end = 0; end < s.length(); end++) {
            int currCount = ++counts[s.charAt(end) - 'A'];
            historicMax = Math.max(historicMax, currCount);
            if(historicMax + k < end - start + 1) {
                counts[s.charAt(start) - 'A']--;
                start++;
            }
        }
        return (s.length() - 1) - start + 1;
    }
}