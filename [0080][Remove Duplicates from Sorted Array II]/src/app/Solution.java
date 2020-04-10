package app;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;
        int insertIdx = 2;
        for(int i = 2; i < nums.length; i++) {
            if(nums[i] != nums[insertIdx - 2]) {
                nums[insertIdx] = nums[i];
                insertIdx++;
            }
        }
        return insertIdx;
    }
}