public class App {
    public static void main(String[] args) throws Exception {
        int[] customers = {1,0,1,2,1,1,7,5}, grumpy = {0,1,0,1,0,1,0,1};
        int X = 3;
        Solution obj = new Solution();
        int result = obj.maxSatisfied(customers, grumpy, X);
        System.out.println(result);
    }
}
