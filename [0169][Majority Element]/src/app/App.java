package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 7, 7, 7, 7};
        Solution obj = new Solution();
        int result = obj.majorityElement(nums);
        System.out.println(result);
    }
}