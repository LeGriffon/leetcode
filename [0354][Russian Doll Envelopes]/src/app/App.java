package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] envelopes = {
            {5, 4},
            {6, 4},
            {6, 7},
            {2, 3}
        };
        Solution obj = new Solution();
        int result = obj.maxEnvelopes(envelopes);
        System.out.println(result);
    }
}