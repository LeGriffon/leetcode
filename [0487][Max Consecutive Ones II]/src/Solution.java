import java.util.*;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int k = 1;
        Deque<Integer> queue = new LinkedList<>();
        for(int low = 0, high = 0; high < nums.length; high++) {
            if(nums[high] == 0) {
                queue.offer(high);
            }
            if(queue.size() > k) {
                low = queue.poll() + 1;
            }
            result = Math.max(result, high - low + 1);
        }
        return result;
    }
}