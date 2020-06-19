import java.util.*;

class Solution {
    public String longestDupSubstring(String S) {
        int n = S.length();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = (int)S.charAt(i) - (int)'a';
        }
        int a = 26;
        long modulus = (long)Math.pow(2, 32);
        
        int left = 1, right = n;
        int length;
        while(left <= right) {
            length = left + (right - left) / 2;
            if(search(length, a, modulus, n, nums) != -1) left = length + 1;
            else right = length - 1;
        }
        int start = search(left - 1, a , modulus, n, nums);
        return S.substring(start, start + left - 1);
    }
    
    private int search(int length, int a, long modulus, int n, int[] nums) {
        long h = 0;
        for(int i = 0; i < length; i++) {
            h = (h * a + nums[i]) % modulus;
        }
        Set<Long> seen = new HashSet<>();
        seen.add(h);
        long aL = 1;
        for(int i = 1; i <= length; i++) {
            aL = (aL * a) % modulus;
        }
        for(int start = 1; start < n - length + 1; start++) {
            h = (h * a - nums[start - 1] * aL % modulus + modulus) % modulus;
            h = (h + nums[start + length - 1]) % modulus;
            if(seen.contains(h)) return start;
            seen.add(h);
        }
        return -1;
    }
}