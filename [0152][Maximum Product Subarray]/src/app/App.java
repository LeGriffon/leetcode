package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {2,3,-2,4};
        Solution obj = new Solution();
        int result = obj.maxProduct(nums);
        System.out.println(result);
    }
}