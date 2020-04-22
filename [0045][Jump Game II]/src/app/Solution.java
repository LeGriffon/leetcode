package app;

public class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currEnd = 0, currFurthest = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            currFurthest = Math.max(currFurthest, i + nums[i]);
            if(i == currEnd) {
                jumps++;
                currEnd = currFurthest;
            }
        }
        return jumps;
    }
}