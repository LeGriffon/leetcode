public class App {
    public static void main(String[] args) throws Exception {
        int[][] dislikes = {
            {1, 2},
            {1, 3},
            {2, 4}
        };
        int N = 4;
        Solution obj = new Solution();
        boolean result = obj.possibleBipartition(N, dislikes);
        System.out.println(result);
    }
}
