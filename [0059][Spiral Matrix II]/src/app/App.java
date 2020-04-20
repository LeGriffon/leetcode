package app;

public class App {
    public static void main(String[] args) throws Exception {
        Solution obj = new Solution();
        int[][] matrix = obj.generateMatrix(3);
        for(int[] row : matrix) {
            for(int n : row) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}