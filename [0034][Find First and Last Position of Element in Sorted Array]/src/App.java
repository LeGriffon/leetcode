public class App {
    public static void main(String args[]) throws Exception {
        Solution obj = new Solution();
        int[] nums = new int[]{5,7,7,8,8,10};
        int[] result = obj.searchRange(nums, 8);
        for (int i : result) {
            System.out.println(i);
        }
    }
}