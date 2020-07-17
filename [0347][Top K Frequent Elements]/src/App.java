public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        Solution obj = new Solution();
        int[] result = obj.topKFrequent(nums, k);
        for(int n : result) {
            System.out.print(n + " ");
        }
    }
}
