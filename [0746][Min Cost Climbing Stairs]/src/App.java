public class App {
    public static void main(String[] args) throws Exception {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        Solution obj = new Solution();
        int result = obj.minCostClimbingStairs(cost);
        System.out.println(result);
    }
}
