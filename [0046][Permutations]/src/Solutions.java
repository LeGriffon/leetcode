import java.util.*;

public class Solutions {
	/*
	 * Backtracking with iteration from the first digit every time (no need to keep
	 * track which number it is at) (Sorting is optional)
	 */
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtracking(list, new ArrayList<Integer>(), nums);
		return list;
	}

	private void backtracking(List<List<Integer>> list, ArrayList<Integer> tempList, int[] nums) {
		if (tempList.size() == nums.length) {
			list.add(new ArrayList(tempList));
		}
		for (int i = 0; i < nums.length; i++) {
			if (tempList.contains(nums[i]))
				continue;
			tempList.add(nums[i]);
			backtracking(list, tempList, nums);
			tempList.remove(tempList.size() - 1);
		}
	}
}
