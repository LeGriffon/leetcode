import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int lengthS = s.length();
        int lengthP = p.length();
        if(lengthS < lengthP) return new ArrayList<>();
        int[] countS = new int[26];
        int[] countP = new int[26];

        for(int i = 0; i < lengthP; i++) {
            countP[p.charAt(i) - 'a']++;
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < lengthS; i++) {
            countS[s.charAt(i) - 'a']++;
            if(i >= lengthP) {
                countS[s.charAt(i - lengthP) - 'a']--;
            }
            if(Arrays.equals(countS, countP)) {
                result.add(i - lengthP + 1);
            }
        }
        return result;
    }
}