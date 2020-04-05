package app;

import java.util.*;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;
        int count1 = 0, count2 = 0;
        Integer candidate1 = null, candidate2 = null;
        for(int num : nums) {
            if(candidate1 != null && num == candidate1) {
                count1++;
            }
            else if(candidate2 != null && num == candidate2) {
                count2++;
            }
            else if(count1 == 0) {
                candidate1 = num;
            }
            else if(count2 == 0) {
                candidate2 = num;
            }
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int num : nums) {
            if(candidate1 != null && num == candidate1) count1++;
            if(candidate2 != null && num == candidate2) count2++;
        }
        if(count1 > nums.length/3) result.add(candidate1);
        if(count2 > nums.length/3) result.add(candidate2);
        return result;
    }
}