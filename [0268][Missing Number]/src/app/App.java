package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        Solution obj = new Solution();
        int result = obj.missingNumber(nums);
        System.out.println(result);
    }
}