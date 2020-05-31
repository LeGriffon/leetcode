public class App {
    public static void main(String[] args) throws Exception {
        int[][] points = {
            {3, 3},
            {5, -1},
            {-2, 4}
        };
        int K = 2;
        Solution obj = new Solution();
        int[][] result = obj.kClosest(points, K);
        for(int[] point : result) {
            for(int n : point) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
