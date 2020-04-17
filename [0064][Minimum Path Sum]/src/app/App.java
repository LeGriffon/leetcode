package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] grid = {
            {1,3,1},
            {1,5,1},
            {4,2,1}
        };
        Solution obj = new Solution();
        int result = obj.minPathSum(grid);
        System.out.println(result);
    }
}