public class App {
    public static void main(String[] args) throws Exception {
        int[][] intervals = {
            {1, 2},
            {2, 3},
            {3, 4},
            {1, 3}
        };
        Solution obj = new Solution();
        int result = obj.eraseOverlapIntervals(intervals);
        System.out.println(result);
    }
}
