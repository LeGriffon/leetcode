public class App {
    public static void main(String[] args) throws Exception {
        int[] A = {4, 2, 5, 7};
        Solution obj = new Solution();
        int[] result = obj.sortArrayByParityII(A);
        for(int n : result) {
            System.out.print(n + " ");
        }
    }
}
