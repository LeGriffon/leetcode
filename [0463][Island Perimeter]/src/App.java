public class App {
    public static void main(String[] args) throws Exception {
        int[][] grid = {
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}
        };
        Solution obj = new Solution();
        int result = obj.islandPerimeter(grid);
        System.out.println(result);
    }
}
