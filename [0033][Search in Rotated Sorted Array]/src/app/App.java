package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {4,5,6,7,0,1,2};
        Solution obj = new Solution();
        int result = obj.search(nums, 0);
        System.out.println(result);
    }
}