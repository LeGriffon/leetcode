public class App {
    public static void main(String[] args) throws Exception {
        int[][] dungeon = {
            {-2, -3, 3},
            {-5, -10, 1},
            {10, 30, -5}
        };
        Solution obj = new Solution();
        int result = obj.calculateMinimumHP(dungeon);
        System.out.println(result);
    }
}
