package app;

import java.util.*;

public class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> index = new HashMap<>(), count = new HashMap<>();
        int degree = 0, result = 0;
        for(int i = 0; i < nums.length; i++) {
            index.putIfAbsent(nums[i], i);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            if(count.get(nums[i]) > degree) {
                degree = count.get(nums[i]);
                result = i - index.get(nums[i]) + 1;
            }
            else if (count.get(nums[i]) == degree) {
                result = Math.min(result, i - index.get(nums[i]) + 1);
            }
        }
        return result;
    }
}