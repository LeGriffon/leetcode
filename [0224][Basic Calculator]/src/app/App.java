package app;

public class App {
    public static void main(String[] args) throws Exception {
        Solution obj = new Solution();
        int result = obj.calculate("(1+(4+5+2)-3)+(6+8)");
        System.out.println(result);
    }
}