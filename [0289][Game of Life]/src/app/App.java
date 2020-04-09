package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] board = {
                {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}
        };
        Solution obj = new Solution();
        obj.gameOfLife(board);
        for(int[] r : board) {
            for(int n : r) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}