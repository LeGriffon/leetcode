package app;

import java.util.*;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int result = 0;
        for(int num : nums) {
            if(!set.contains(num - 1)) {
                int currNum = num;
                int currResult = 1;
                while(set.contains(currNum + 1)) {
                    currNum++;
                    currResult++;
                }
                result = Math.max(result, currResult);
            }
        }
        return result;
    }
}