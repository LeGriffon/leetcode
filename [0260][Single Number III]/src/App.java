public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1,2,1,3,2,5};
        Solution obj = new Solution();
        int[] result = obj.singleNumber(nums);
        System.out.println(result[0] + " " + result[1]);
    }
}
