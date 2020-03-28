package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] A = {
                        {0, 1, 0},
                        {0, 0, 0},
                        {0, 0, 1}
                    };
        Solution obj = new Solution();
        int result = obj.shortestBridge(A);
        System.out.println(result);
    }
}