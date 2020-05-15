public class App {
    public static void main(String[] args) throws Exception {
        int[] A = {1, -2, 3, -2};
        Solution obj = new Solution();
        int result = obj.maxSubarraySumCircular(A);
        System.out.println(result);
    }
}
