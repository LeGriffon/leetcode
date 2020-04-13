package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {0,1,0};
        Solution obj = new Solution();
        int result = obj.findMaxLength(nums);
        System.out.println(result);
    }
}