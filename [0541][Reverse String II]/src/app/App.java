package app;

public class App {
    public static void main(String[] args) throws Exception {
        String s = "abcdefg";
        int k = 2;
        Solution obj = new Solution();
        String result = obj.reverseStr(s, k);
        System.out.println(result);
    }
}