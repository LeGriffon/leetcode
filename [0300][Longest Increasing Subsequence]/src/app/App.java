package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {10,9,2,5,3,7,101,18};
        Solution obj = new Solution();
        int result = obj.lengthOfLIS(nums);
        System.out.println(result);
    }
}