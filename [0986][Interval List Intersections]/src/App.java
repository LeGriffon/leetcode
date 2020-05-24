public class App {
    public static void main(String[] args) throws Exception {
        int[][] A = {{0,2},{5,10},{13,23},{24,25}}, B = {{1,5},{8,12},{15,24},{25,26}};
        Solution obj = new Solution();
        int[][] result = obj.intervalIntersection(A, B);
        for(int[] row : result) {
            for(int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
