public class App {
    public static void main(String[] args) throws Exception {
        int[][] people = {
            {7, 0},
            {4, 4},
            {7, 1},
            {5, 0},
            {6, 1},
            {5, 2}
        };
        Solution obj = new Solution();
        int[][] result = obj.reconstructQueue(people);
        for(int[] person : result) {
            for(int n : person) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
