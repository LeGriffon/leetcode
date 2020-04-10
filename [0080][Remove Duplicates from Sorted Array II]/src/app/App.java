package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        Solution obj = new Solution();
        int result = obj.removeDuplicates(nums);
        System.out.println(result);
        for(int n : nums) {
            System.out.print(n + " ");
        }
    }
}