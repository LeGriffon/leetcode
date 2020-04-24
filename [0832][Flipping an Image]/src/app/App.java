package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] A = {
            {1,1,0,0},
            {1,0,0,1},
            {0,1,1,1},
            {1,0,1,0}
        };
        Solution obj = new Solution();
        obj.flipAndInvertImage(A);
        for(int[] row : A) {
            for(int n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}