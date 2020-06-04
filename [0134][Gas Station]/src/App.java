public class App {
    public static void main(String[] args) throws Exception {
        int[] gas = {1,2,3,4,5}, cost = {3,4,5,1,2};
        Solution obj = new Solution();
        int result = obj.canCompleteCircuit(gas, cost);
        System.out.println(result);
    }
}
