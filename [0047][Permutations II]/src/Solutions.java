import java.util.*;

public class Solutions {
	/*
	 * Backtracking with a boolean array keeping track of which digit has been
	 * visited already. if(used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i -
	 * 1]) continue; used[I]: have already used current digit i > 0 && nums[i] ==
	 * nums[i - 1] && !used[i - 1]: digits that is not the first digit, and it is
	 * duplicate of the previous one digit which has not been visited before
	 * (duplicates can produce identical permutations, so we should avoid using
	 * them)
	 */
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtracking(list, new ArrayList<Integer>(), nums, new boolean[nums.length]);
		return list;
	}

	private void backtracking(List<List<Integer>> list, ArrayList<Integer> tempList, int[] nums, boolean[] used) {
		if (tempList.size() == nums.length) {
			list.add(new ArrayList<>(tempList));
		}
		for (int i = 0; i < nums.length; i++) {
			if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
				continue;
			used[i] = true;
			tempList.add(nums[i]);
			backtracking(list, tempList, nums, used);
			tempList.remove(tempList.size() - 1);
			used[i] = false;
		}
	}
}
