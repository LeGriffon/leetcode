package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {0,2,3,4,6,8,9};
        Solution obj = new Solution();
        List<String> result = obj.summaryRanges(nums);
        System.out.println(result);
    }
}