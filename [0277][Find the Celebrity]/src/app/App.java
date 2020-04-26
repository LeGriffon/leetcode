package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] matrix = {
                    {1,1,0},
                    {0,1,0},
                    {1,1,1}
        };
        int n = 3;
        Solution obj = new Solution(matrix);
        int result = obj.findCelebrity(n);
        System.out.println(result);
    }
}