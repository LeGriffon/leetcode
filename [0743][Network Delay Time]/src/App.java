public class App {
    public static void main(String[] args) throws Exception {
        int[][] times = {{2,1,1},{2,3,1},{3,4,1}};
        int N = 4, K = 2;
        Solution obj = new Solution();
        int result = obj.networkDelayTime(times, N, K);
        System.out.println(result);
    }
}
