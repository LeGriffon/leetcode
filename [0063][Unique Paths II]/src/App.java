public class App {
    public static void main(String[] args) throws Exception {
        Solution obj = new Solution();
        int[][] obstacleGrid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        int result = obj.uniquePathsWithObstacles(obstacleGrid);
        System.out.println(result);
    }
}
