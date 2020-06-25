public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1,1,0,1,1,1};
        Solution obj = new Solution();
        int result = obj.findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }
}
