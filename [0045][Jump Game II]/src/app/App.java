package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {2,3,1,1,4};
        Solution obj = new Solution();
        int result = obj.jump(nums);
        System.out.println(result);
    }
}