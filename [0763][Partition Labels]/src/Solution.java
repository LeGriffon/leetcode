import java.util.*;

class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();
        int[] last = new int[26];
        for(int i = 0; i < S.length(); i++) {
            last[S.charAt(i) - 'a'] = i;
        }
        int i = 0, anchor = 0;
        for(int j = 0; j < S.length(); j++) {
            i = Math.max(i, last[S.charAt(j) - 'a']);
            if(i == j) {
                result.add(i - anchor + 1);
                anchor = i + 1;
            }
        }
        return result;
    }
}