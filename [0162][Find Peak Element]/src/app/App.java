package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1,2,1,3,5,6,4};
        Solution obj = new Solution();
        int result = obj.findPeakElement(nums);
        System.out.println(result);
    }
}