
public class Solution {
	public int maxSubArray(int[] nums) {
		/*
		 * We default to say the the best maximum seen so far is the first element. We
		 * also default to say the the best max ending at the first element is...the
		 * first element. (this is because on Leetcode we must choose a subarray of at
		 * least one item, we cannot choose nothing)
		 */
		int maxSoFar = nums[0];
		int maxEndingHere = nums[0];

		/*
		 * We will investigate the rest of the items in the array from index 1 onward.
		 */
		for (int i = 1; i < nums.length; i++) {
			/*
			 * We are inspecting the item at index i. We want to answer the question:
			 * "What is the Max Contiguous Subarray Sum we can achieve ending at index i?"
			 * We have 2 choices: maxEndingHere + nums[i] (extend the previous subarray best
			 * whatever it was) 1.) Let the item we are sitting at contribute to this best
			 * max we achieved ending at index i - 1. nums[i] (start and end at this index)
			 * 2.) Just take the item we are sitting at's value. The max of these 2 choices
			 * will be the best answer to the Max Contiguous Subarray Sum we can achieve for
			 * subarrays ending at index i.
			 */
			maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);

			/*
			 * Did we beat the 'maxSoFar' with the 'maxEndingHere'?
			 */
			maxSoFar = Math.max(maxEndingHere, maxSoFar);
		}
		return maxSoFar;
	}
}
