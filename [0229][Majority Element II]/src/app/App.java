package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1,1,1,3,3,2,2,2};
        Solution obj = new Solution();
        List<Integer> result = obj.majorityElement(nums);
        for(int n : result) {
            System.out.println(n);
        }
    }
}