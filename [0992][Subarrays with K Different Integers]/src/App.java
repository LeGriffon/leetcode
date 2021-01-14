public class App {
    public static void main(String[] args) throws Exception {
        int[] A = {1,2,1,2,3};
        int K = 2;
        Solution obj = new Solution();
        int result = obj.subarraysWithKDistinct(A, K);
        System.out.println(result);
    }
}
