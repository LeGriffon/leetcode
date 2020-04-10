package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {100, 4, 200, 1, 3, 2};
        Solution obj = new Solution();
        int result = obj.longestConsecutive(nums);
        System.out.println(result);
    }
}