package app;

public class App {
    public static void main(String[] args) throws Exception {
        char[][] grid = {  
                            {'1','1','1','1','0'},
                            {'1','1','0','1','0'},
                            {'1','1','0','0','0'},
                            {'0','0','0','0','0'}};
        Solution obj = new Solution();
        int result = obj.numIslands(grid);
        System.out.println(result);
    }
}