
import java.util.*;
public class Solutions {
	/*
	 * Backtracking using one more line to skip duplicate in the original set.
     *   if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
	 */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(list, new ArrayList<Integer>(), nums, 0);
        return list;
    }
    private void backtracking(List<List<Integer>> list, ArrayList<Integer> tempList, int[] nums, int start) {
        list.add(new ArrayList(tempList));
        for(int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i - 1]) continue;
            tempList.add(nums[i]);
            backtracking(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
            
        }
    }
}
