public class App {
    public static void main(String[] args) throws Exception {
        int[] A = {2,5,1,2,5}, B = {10,5,2,1,5,2};
        Solution obj = new Solution();
        int result = obj.maxUncrossedLines(A, B);
        System.out.println(result);
    }
}
