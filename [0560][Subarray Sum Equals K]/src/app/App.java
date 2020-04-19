package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {3, 4, 7, 2, -3, 1, 4, 2};
        int k = 7;
        Solution obj = new Solution();
        int result = obj.subarraySum(nums, k);
        System.out.println(result);
    }
}