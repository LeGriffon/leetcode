public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {0,1,0,1,0,1,99};
        Solution obj = new Solution();
        int result = obj.singleNumber(nums);
        System.out.println(result);
    }
}
