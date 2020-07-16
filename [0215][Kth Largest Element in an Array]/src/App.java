public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        Solution obj = new Solution();
        int result = obj.findKthLargest(nums, k);
        System.out.println(result);
    }
}
