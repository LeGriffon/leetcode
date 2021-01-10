public class App {
    public static void main(String[] args) throws Exception {
        int k = 2, W = 0;
        int[] Profits={1,2,3}, Capital={0,1,1};
        Solution obj = new Solution();
        int result = obj.findMaximizedCapital(k, W, Profits, Capital);
        System.out.println(result);
    }
}
