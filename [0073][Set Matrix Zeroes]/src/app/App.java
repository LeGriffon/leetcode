package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] matrix = {
                            {0,1,2,0},
                            {3,4,5,2},
                            {1,3,1,5}
                        };
        Solution obj = new Solution();
        obj.setZeroes(matrix);
        for(int[] row : matrix) {
            for(int n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}