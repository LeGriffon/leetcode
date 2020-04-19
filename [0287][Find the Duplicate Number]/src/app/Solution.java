package app;

public class Solution {
    public int findDuplicate(int[] nums) {
        int turtle = nums[0];
        int rabbit = nums[0];
        do {
            turtle = nums[turtle];
            rabbit = nums[nums[rabbit]];
        } while(turtle != rabbit);
        turtle = nums[0];
        while(turtle != rabbit) {
            turtle = nums[turtle];
            rabbit = nums[rabbit];
        }
        return turtle;
    }
}