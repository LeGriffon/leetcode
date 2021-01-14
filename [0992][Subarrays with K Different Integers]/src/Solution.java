import java.util.*;

class Solution {
    public int subarraysWithKDistinct(int[] A, int K) {
        return atMostK(A, K) - atMostK(A, K - 1);
    }
    
    private int atMostK(int[] A, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        int start = 0;
        for(int end = 0; end < A.length; end++) {
            if(map.getOrDefault(A[end], 0) == 0) K--;
            map.put(A[end], map.getOrDefault(A[end], 0) + 1);
            while(K < 0) {
                map.put(A[start], map.get(A[start]) - 1);
                if(map.get(A[start]) == 0) K++;
                start++;
            }
            result += end - start + 1;
        }
        return result;
    }
}