public class App {
    public static void main(String[] args) throws Exception {
        int[][] grid = new int[][] {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        Solution obj = new Solution();
        int result = obj.shortestPathBinaryMatrix(grid);
        System.out.println(result);
    }
}
