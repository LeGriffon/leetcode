import java.util.*;
public class Solution {
	/*
	 * Backtracking with a start index keeping track of which number to build next subset
	 */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(list, new ArrayList<Integer>(), nums, 0);
        return list;
    }
    private void backtracking(List<List<Integer>> list, ArrayList<Integer> tempList, int[] nums, int start) {
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtracking(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
