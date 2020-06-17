public class App {
    public static void main(String[] args) throws Exception {
        char[][] board = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
        };
        Solution obj = new Solution();
        obj.solve(board);
        for(char[] row : board) {
            for(char ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
