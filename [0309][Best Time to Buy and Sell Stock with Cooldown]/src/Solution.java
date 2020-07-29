class Solution {
    public int maxProfit(int[] prices) {
        int reset = 0;
        int held = Integer.MIN_VALUE;
        int sold = Integer.MIN_VALUE;
        
        for(int price : prices) {
            int preSold = sold;
            
            sold = held + price;
            held = Math.max(held, reset - price);
            reset = Math.max(reset, preSold);
        }
        return Math.max(reset, sold);
    }
}