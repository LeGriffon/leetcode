package app;

import java.util.Arrays;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        int length = 0;
        for(int num : nums) {
            int index = Arrays.binarySearch(dp, 0, length, num);
            if(index < 0) {
                index = - (index + 1);
            }
            dp[index] = num;
            if(index == length) {
                length++;
            }
        }
        return length;
    }
}