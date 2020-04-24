package app;

public class Solution {
    public void sortColors(int[] nums) {
        int pt0 = 0, curr = 0, pt2 = nums.length - 1;
        while(curr <= pt2) {
            if(nums[curr] == 0) {
                swap(nums, curr, pt0);
                pt0++;
                curr++;
            }
            else if(nums[curr] == 2) {
                swap(nums, curr, pt2);
                pt2--;
            }
            else {
                curr++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}