package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {4,1,2,1,2};
        Solution obj = new Solution();
        int result = obj.singleNumber(nums);
        System.out.println(result);
    }
}