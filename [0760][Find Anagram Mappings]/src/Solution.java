import java.util.*;

class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        int[] mapping = new int[A.length];
        
        int index = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : B) {
            map.put(num, index++);
        }
        
        for(int i = 0; i < A.length; i++) {
            mapping[i] = map.get(A[i]);
        }
        return mapping;
    }
}