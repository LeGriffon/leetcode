package app;
import Solution.Solution;
public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] input = {1,2,5};
        int result = solution.coinChange(input, 11);
        System.out.println(result);
    }
}