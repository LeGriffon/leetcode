package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Solution obj = new Solution();
        List<List<Integer>> result = obj.threeSum(nums);
        for(List l : result) {
            ListIterator<Integer> iterator = l.listIterator();
            while(iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            System.out.println();
        }
        
    }
}