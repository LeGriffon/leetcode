public class App {
    public static void main(String[] args) throws Exception {
        int[][] grid = new int[][] {
            {1, 1, 0, 1, 1},
            {1, 0, 0, 0, 0},
            {0, 0, 0, 0, 1},
            {1, 1, 0, 1, 1}
        };
        Solution obj = new Solution();
        int result = obj.numDistinctIslands(grid);
        System.out.println(result);
    }
}
