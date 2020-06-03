public class App {
    public static void main(String[] args) throws Exception {
        int[][] costs = {
            {10, 20},
            {30, 200},
            {400, 50},
            {30, 20}
        };
        Solution obj = new Solution();
        int result = obj.twoCitySchedCost(costs);
        System.out.println(result);
    }
}
