package app;

public class App {
    public static void main(String[] args) throws Exception {
        Solution obj = new Solution();
        int[][] intervals = {
            {0, 30},
            {5, 10},
            {15, 20}, 
            {7, 10},
            {2, 4}
        };
        int result = obj.minMeetingRooms(intervals);
        System.out.println(result);
    }
}