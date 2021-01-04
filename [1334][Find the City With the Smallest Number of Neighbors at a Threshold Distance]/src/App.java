public class App {
    public static void main(String[] args) throws Exception {
        int n = 5;
        int[][] edges = {{0,1,2},{0,4,8},{1,2,3},{1,4,2},{2,3,1},{3,4,1}};
        int distanceThreshold = 2;
        Solution obj = new Solution();
        int result = obj.findTheCity(n, edges, distanceThreshold);
        System.out.println(result);
    }
}
