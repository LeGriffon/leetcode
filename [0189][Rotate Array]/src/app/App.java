package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        Solution obj = new Solution();
        obj.rotate(nums, k);
        for(int n : nums) {
            System.out.print(n + " ");
        }
    }
}