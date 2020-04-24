package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {2,0,2,1,1,0};
        Solution obj = new Solution();
        obj.sortColors(nums);
        for(int n : nums) {
            System.out.print(n + " ");
        }
    }
}