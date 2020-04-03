package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {-1,2,1,-4};
        Solution obj = new Solution();
        int result = obj.threeSumClosest(nums, 1);
        System.out.println(result);
    }
}