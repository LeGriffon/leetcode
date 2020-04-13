package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1, 1, 5};
        Solution obj = new Solution();
        obj.nextPermutation(nums);
        for(int n : nums) {
            System.out.print(n + " ");
        }
    }
}