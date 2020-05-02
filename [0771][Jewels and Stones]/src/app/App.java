package app;

public class App {
    public static void main(String[] args) throws Exception {
        String J = "aA", S = "aAAbbbb";
        Solution obj = new Solution();
        int result = obj.numJewelsInStones(J, S);
        System.out.println(result);
    }
}