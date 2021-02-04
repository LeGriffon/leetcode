import java.util.*;

class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int findLHS(int[] nums) {
        int result = 0;
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.containsKey(num - 1)) {
                result = Math.max(result, map.get(num) + map.get(num - 1));
            }
            if(map.containsKey(num + 1)) {
                result = Math.max(result, map.get(num) + map.get(num + 1));
            }
        }
        return result;
    }
}