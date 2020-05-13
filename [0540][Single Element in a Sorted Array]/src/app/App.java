package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        Solution obj = new Solution();
        int result = obj.singleNonDuplicate(nums);
        System.out.println(result);
    }
}