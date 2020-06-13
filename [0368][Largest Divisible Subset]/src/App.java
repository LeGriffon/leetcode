import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1, 2, 4, 8};
        Solution obj = new Solution();
        List<Integer> result = obj.largestDivisibleSubset(nums);
        System.out.println(result);
    }
}
