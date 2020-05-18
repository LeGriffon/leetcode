import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int lengthS1 = s1.length();
        int lengthS2 = s2.length();
        if(lengthS1 > lengthS2) return false;
        int[] countS1 = new int[26];
        int[] countS2 = new int[26];

        for(int i = 0; i < lengthS1; i++) {
            countS1[s1.charAt(i) - 'a']++;
        }

        for(int i = 0; i < lengthS2; i++) {
            countS2[s2.charAt(i) - 'a']++;
            if(i >= lengthS1) {
                countS2[s2.charAt(i - lengthS1) - 'a']--;
            }
            if(Arrays.equals(countS1, countS2)) {
                return true;
            }
        }
        return false;
    }
}