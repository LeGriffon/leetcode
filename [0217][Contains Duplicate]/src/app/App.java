package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        Solution obj = new Solution();
        boolean result = obj.containsDuplicate(nums);
        System.out.println(result);
    }
}