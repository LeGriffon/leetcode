import java.util.*;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        for(int i = 1; i <= k; i++) {
            curr.add(i);
        }
        curr.add(n + 1);
        
        int j = 0;
        while(j < k) {
            j = 0;
            result.add(new ArrayList<>(curr.subList(0, k)));
            while((j < k) && curr.get(j) + 1 == curr.get(j + 1)) {
                curr.set(j, j + 1);
                j++;
            }
            curr.set(j, curr.get(j) + 1);
        }
        return result;
    }
}