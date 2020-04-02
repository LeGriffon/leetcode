package app;

public class App {
    public static void main(String[] args) throws Exception {
        Solution obj = new Solution();
        boolean result = obj.isHappy(19);
        System.out.println(result);
        result = obj.isHappy(4);
        System.out.println(result);
    }
}