public class App {

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[][] intervals = {
                                {1,3},
                                {2,6},
                                {8,10},
                                {15,18}
                            };
        int[][] result = obj.merge(intervals);
        
        for(int[] a : result) {
            for(int n : a) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}