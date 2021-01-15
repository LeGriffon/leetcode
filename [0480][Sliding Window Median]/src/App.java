public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        Solution obj = new Solution();
        double[] result = obj.medianSlidingWindow(nums, k);
        for(double num : result) {
            System.out.println(num + " ");
        }
    }
}
