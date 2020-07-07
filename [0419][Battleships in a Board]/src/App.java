public class App {
    public static void main(String[] args) throws Exception {
        char[][] board = {
            {'X', '.', '.', 'X'},
            {'.', '.', '.', 'X'},
            {'.', '.', '.', 'X'},
            {'.', '.', '.', 'X'}
        };
        Solution obj = new Solution();
        int result = obj.countBattleships(board);
        System.out.println(result);
    }
}
