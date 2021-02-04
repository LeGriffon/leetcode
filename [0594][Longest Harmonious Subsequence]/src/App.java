public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[] {1,3,2,2,5,2,3,7};
        Solution obj = new Solution();
        int result = obj.findLHS(nums);
        System.out.println(result);
    }
}
