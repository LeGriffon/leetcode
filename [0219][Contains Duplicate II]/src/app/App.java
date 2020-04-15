package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1,2,3,1};
        int k = 3;
        Solution obj = new Solution();
        boolean result = obj.containsNearbyDuplicate(nums, k);
        System.out.println(result);
    }
}