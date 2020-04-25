package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] matrix = {
            {1,   3,  5,  7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
        };
        int target = 3;
        Solution obj = new Solution();
        boolean result = obj.searchMatrix(matrix, target);
        System.out.println(result);
    }
}