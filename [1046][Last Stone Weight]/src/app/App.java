package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] stones = {2,7,4,1,8,1};
        Solution obj = new Solution();
        int result = obj.lastStoneWeight(stones);
        System.out.println(result);
    }
}