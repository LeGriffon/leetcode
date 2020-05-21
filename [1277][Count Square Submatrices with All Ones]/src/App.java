public class App {
    public static void main(String[] args) throws Exception {
        int[][] matrix =
        {
          {0,1,1,1},
          {1,1,1,1},
          {0,1,1,1}
        };
        Solution obj = new Solution();
        int result = obj.countSquares(matrix);
        System.out.println(result);
    }
}
