
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] range = {-1, -1};
        
        int leftIndex = searchHelper(nums, target, true);
        if(leftIndex == nums.length || nums[leftIndex] != target) {
            return range;
        }
        range[0] = leftIndex;
        range[1] = searchHelper(nums, target, false) - 1;
        
        return range;
    }
    private int searchHelper(int[] nums, int target, boolean findingLeft) {
        int low = 0;
        int high = nums.length;
        while(low < high) {
            int mid = low + (high - low)/2;
            if(nums[mid] > target || (findingLeft && nums[mid] == target)) {
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
