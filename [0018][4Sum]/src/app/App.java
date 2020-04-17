package app;

import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        Solution obj = new Solution();
        List<List<Integer>> result = obj.fourSum(nums, target);
        for(List<Integer> l : result) {
            for(int n : l) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}