public class App {
    public static void main(String[] args) throws Exception {
        int n = 3;
        int[][] flights = {{0,1,100},{1,2,100},{0,2,500}};
        int src = 0, dst = 2, K = 1;
        Solution obj = new Solution();
        int result = obj.findCheapestPrice(n, flights, src, dst, K);
        System.out.println(result);
    }
}
