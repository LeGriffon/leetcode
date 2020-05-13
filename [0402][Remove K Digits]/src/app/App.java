package app;

public class App {
    public static void main(String[] args) throws Exception {
        String num = "1234567890";
        int k = 9;
        Solution obj = new Solution();
        String result = obj.removeKdigits(num, k);
        System.out.println(result);
    }
}