import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> maximum = new HashSet<>();
        for(int num : nums) {
            maximum.add(num);
            if(maximum.size() > 3) {
                maximum.remove(Collections.min(maximum));
            }
        }
        if(maximum.size() == 3) {
            return Collections.min(maximum);
        }
        return Collections.max(maximum);
    }
}