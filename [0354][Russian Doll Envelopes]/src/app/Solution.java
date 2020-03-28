package app;

import java.util.*;

class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        if(envelopes == null || envelopes.length == 0 || envelopes[0] == null || envelopes[0].length != 2) return 0;
        Arrays.sort(envelopes, new Comparator<int[]>() {
            public int compare(int[] a1, int[] a2) {
                if(a1[0] == a2[0]) {
                    return a2[1] - a1[1];
                }
                else {
                    return a1[0] - a2[0];
                }
            }
        });
        int[] dp = new int[envelopes.length];
        int length = 0;
        for(int[] envelope : envelopes) {
            int index = Arrays.binarySearch(dp, 0, length, envelope[1]);
            if(index < 0) {
                index = - (index + 1);
            }
            dp[index] = envelope[1];
            if(index == length) {
                length++;
            }
        }
        return length;
    }
}