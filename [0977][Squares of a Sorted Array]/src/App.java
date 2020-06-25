public class App {
    public static void main(String[] args) throws Exception {
        int[] A = {-4,-1,0,3,10};
        Solution obj = new Solution();
        int[] result = obj.sortedSquares(A);
        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}
