package app;

public class App {
    public static void main(String[] args) throws Exception {
        String s = "()[]{}";
        Solution obj = new Solution();
        boolean result = obj.isValid(s);
        System.out.println(result);
    }
}