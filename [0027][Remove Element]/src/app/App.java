package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {0,1,2,2,3,0,4,2};
        Solution obj = new Solution();
        int result = obj.removeElement(nums, 2);
        System.out.println(result);
    }
}