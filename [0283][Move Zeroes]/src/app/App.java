package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {0,1,0,3,12};
        Solution obj = new Solution();
        obj.moveZeroes(nums);
        for(int n : nums) {
            System.out.println(n);
        }
    }
}