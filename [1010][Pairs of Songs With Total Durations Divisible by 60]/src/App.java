public class App {
    public static void main(String[] args) throws Exception {
        int[] time = {30,20,150,100,40};
        Solution obj = new Solution();
        int result = obj.numPairsDivisibleBy60(time);
        System.out.println(result);
    }
}
