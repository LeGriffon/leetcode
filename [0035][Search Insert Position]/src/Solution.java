
public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0) return -1;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
        	//Binary search: finding mid index with int mid = low + (high - low)/2; to avoid overflow
            int mid = low + (high - low)/2;
            if(nums[mid] == target) {
                return mid;
            } 
            if(nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return low;
    }
}
