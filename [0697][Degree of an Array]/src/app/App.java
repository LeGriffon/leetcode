package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1,2,2,3,1,4,2};
        Solution obj = new Solution();
        int result = obj.findShortestSubArray(nums);
        System.out.println(result);
    }
}