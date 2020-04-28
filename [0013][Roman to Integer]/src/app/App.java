package app;

public class App {
    public static void main(String[] args) throws Exception {
        String s = "MCMXCIV";
        Solution obj = new Solution();
        int result = obj.romanToInt(s);
        System.out.println(result);
    }
}