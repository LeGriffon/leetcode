package app;

import java.util.*;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtracking(int[] candidates, int target, int index, List<Integer> combination, List<List<Integer>> result) {
        if(target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        else if(target > 0) {
            for(int i = index; i < candidates.length; i++) {
                combination.add(candidates[i]);
                backtracking(candidates, target - candidates[i], i, combination, result);
                combination.remove(combination.size() - 1);
            }
        }
    }
}