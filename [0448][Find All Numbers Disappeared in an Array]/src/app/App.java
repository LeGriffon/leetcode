package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {4,3,2,7,8,2,3,1};
        Solution obj = new Solution();
        List<Integer> result = obj.findDisappearedNumbers(nums);
        for(int n : result) {
            System.out.println(n + " ");
        }
    }
}