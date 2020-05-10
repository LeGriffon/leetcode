package app;

public class App {
    public static void main(String[] args) throws Exception {
        int N = 4;
        int[][] trust = {
            {1,3},{1,4},{2,3},{2,4},{4,3}
        };
        Solution obj = new Solution();
        int result = obj.findJudge(N, trust);
        System.out.println(result);
    }
}