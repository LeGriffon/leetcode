package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {3,1,3,4,2};
        Solution obj = new Solution();
        int result = obj.findDuplicate(nums);
        System.out.println(result);
    }
}