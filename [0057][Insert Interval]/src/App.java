public class App {
    public static void main(String[] args) throws Exception {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        Solution obj = new Solution();
        int[][] result = obj.insert(intervals, newInterval);
        for(int[] interval : result) {
            for(int n : interval) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
