public class App {
    public static void main(String[] args) throws Exception {
        int[] prices = {1,2,3,0,2};
        Solution obj = new Solution();
        int result = obj.maxProfit(prices);
        System.out.println(result);
    }
}
