public class App {
    public static void main(String[] args) throws Exception {
        int[][]  matrix = 
        {
          {9,9,4},
          {6,6,8},
          {2,1,1}
        };
        Solution obj = new Solution();
        int result = obj.longestIncreasingPath(matrix);
        System.out.println(result);
    }
}
