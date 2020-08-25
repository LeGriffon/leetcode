public class App {
    public static void main(String[] args) throws Exception {
        int[] days = {1,2,3,4,5,6,7,8,9,10,30,31}, costs = {2,7,15};
        Solution obj = new Solution();
        int result = obj.mincostTickets(days, costs);
        System.out.println(result);
    }
}
