package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] prices = {7,1,5,3,6,4};
        Solution obj = new Solution();
        int result = obj.maxProfit(prices);
        System.out.println(result);
    }
}