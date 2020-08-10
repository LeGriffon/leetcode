public class App {
    public static void main(String[] args) throws Exception {
        int[][] grid = {
            {2, 1, 1},
            {0, 1, 1},
            {0, 1, 1}
        };
        Solution obj = new Solution();
        int result = obj.orangesRotting(grid);
        System.out.println(result);
    }
}
