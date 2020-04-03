package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1,2,3,4};
        Solution obj = new Solution();
        int[] result = obj.productExceptSelf(nums);
        for(int n : result) {
            System.out.println(n);
        }
    }
}