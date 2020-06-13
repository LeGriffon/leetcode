import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();

        int[] dp = new int[nums.length];

        Arrays.sort(nums);

        int maxSubsetSize = -1;
        int maxSubsetIndex = -1;

        for(int i = 0; i < nums.length; i++) {
            int subsetSize = 0;
            for(int k = 0; k < i; k++) {
                if(nums[i] % nums[k] == 0 && subsetSize < dp[k]) {
                    subsetSize = dp[k];
                }
            }
            dp[i] = subsetSize + 1;
            if(maxSubsetSize < dp[i]) {
                maxSubsetSize = dp[i];
                maxSubsetIndex = i;
            }
        }

        List<Integer> result = new ArrayList<>();
        int currSize = maxSubsetSize;
        int currTail = nums[maxSubsetIndex];

        for(int i = nums.length - 1; i >= 0; i--) {
            if(currSize == 0) break;

            if(currTail % nums[i] == 0 && currSize == dp[i]) {
                result.add(0, nums[i]);
                currTail = nums[i];
                currSize--;
            }
        }

        return result;
    }
}