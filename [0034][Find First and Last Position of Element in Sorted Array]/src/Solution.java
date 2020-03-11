
public class Solution {
	/*
	 * Binary Search: Because the array is sorted, we can use binary search to
	 * locate the left and rightmost indices.
	 * 
	 * The overall algorithm works fairly similarly to the linear scan approach,
	 * except for the subroutine used to find the left and rightmost indices
	 * themselves. Here, we use a modified binary search to search a sorted array,
	 * with a few minor adjustments. First, because we are locating the leftmost (or
	 * rightmost) index containing target(rather than returning true if we find
	 * target), the algorithm does not terminate as soon as we find a match.
	 * Instead, we continue to search until low == high and they contain some index
	 * at which target can be found. The other change is the introduction of the
	 * left parameter, which is a boolean indicating what to do in the event that
	 * target == nums[mid]; if left is true, then we "recurse" on the left subarray
	 * on ties. Otherwise, we go right. To see why this is correct, consider the
	 * situation where we find target at index i. The leftmost target cannot occur
	 * at any index greater than i, so we never need to consider the right subarray.
	 * The same argument applies to the rightmost index.
	 */
	public int[] searchRange(int[] nums, int target) {
		int[] range = { -1, -1 };

		int leftIndex = searchHelper(nums, target, true);
		if (leftIndex == nums.length || nums[leftIndex] != target) {
			return range;
		}
		range[0] = leftIndex;
		range[1] = searchHelper(nums, target, false);

		return range;
	}

	private int searchHelper(int[] nums, int target, boolean findingLeft) {
		int low = 0;
		int high = nums.length - 1;
		while (low + 1 < high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] > target || (findingLeft && nums[mid] == target)) {
				high = mid;
			} else {
				low = mid;
			}
		}
		if(findingLeft) {
            if(nums[low] == target) {
                return low;
            }
            else {
                return high;
            }
        }
        else {
            if(nums[high] == target) {
                return high;
            }
            else {
                return low;
            }
        }
	}
}
