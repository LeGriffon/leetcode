import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<List<Integer>> subsets(final int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtracking(new ArrayList<>(), result, nums, 0);
        return result;
    }

    private void backtracking(List<Integer> tempList, List<List<Integer>> result, final int[] nums, int start) {
        result.add(new ArrayList<Integer>(tempList));
        for(int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtracking(tempList, result, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}