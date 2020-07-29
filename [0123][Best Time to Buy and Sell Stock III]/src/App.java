public class App {
    public static void main(String[] args) throws Exception {
        int[] prices = {3,3,5,0,0,3,1,4};
        Solution obj = new Solution();
        int result = obj.maxProfit(prices);
        System.out.println(result);
    }
}
