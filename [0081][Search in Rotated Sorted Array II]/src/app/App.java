package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {2,5,6,0,0,1,2};
        Solution obj = new Solution();
        boolean result = obj.search(nums, 0);
        System.out.println(result);
        result = obj.search(nums, 3);
        System.out.println(result);
    }
}