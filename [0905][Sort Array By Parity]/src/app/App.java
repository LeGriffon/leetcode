package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] A = {3,1,2,4};
        Solution obj = new Solution();
        int[] result = obj.sortArrayByParity(A);
        for(int n : result) {
            System.out.print(n + " ");
        }
    }
}