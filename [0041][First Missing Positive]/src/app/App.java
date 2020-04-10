package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {3,4,-1,1};
        Solution obj = new Solution();
        int result = obj.firstMissingPositive(nums);
        for(int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println(result);
    }
}