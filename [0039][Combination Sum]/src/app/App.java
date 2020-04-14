package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] candidates = {2,3,5};
        int target = 8;
        Solution obj = new Solution();
        List<List<Integer>> result = obj.combinationSum(candidates, target);
        for(List<Integer> l : result) {
            for(int n : l) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}