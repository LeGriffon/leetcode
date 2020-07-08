public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {-2,0,1,3};
        int target = 2;
        Solution obj = new Solution();
        int result = obj.threeSumSmaller(nums, target);
        System.out.println(result);
    }
}
