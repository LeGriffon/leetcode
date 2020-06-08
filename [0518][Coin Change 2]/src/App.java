public class App {
    public static void main(String[] args) throws Exception {
        int[] coins = {1, 2, 5};
        int amount = 5;
        Solution obj = new Solution();
        int result = obj.change(amount, coins);
        System.out.println(result);
    }
}
