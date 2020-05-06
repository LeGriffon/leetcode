package app;

public class App {
    public static void main(String[] args) throws Exception {
        String moves = "UDLR";
        Solution obj = new Solution();
        boolean result = obj.judgeCircle(moves);
        System.out.println(result);
    }
}