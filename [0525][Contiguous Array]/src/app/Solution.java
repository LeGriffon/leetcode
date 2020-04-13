package app;

import java.util.*;

public class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int result = 0, count = 0;
        for(int i = 0; i < nums.length; i++) {
            count += nums[i] == 1 ? 1 : -1;
            if(map.containsKey(count)) {
                result = Math.max(result, i - map.get(count));
            }
            else {
                map.put(count, i);
            }
        }
        return result;
    }
}