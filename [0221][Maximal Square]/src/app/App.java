package app;

public class App {
    public static void main(String[] args) throws Exception {
        char[][] matrix = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };
        Solution obj = new Solution();
        int result = obj.maximalSquare(matrix);
        System.out.println(result);
    }
}