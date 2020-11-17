package app;

public class App {
    public static void main(String[] args) throws Exception {
        String s = "226";
        Solution obj = new Solution();
        Solution2 obj2 = new Solution2();
        int result = obj.numDecodings(s);
        int result2 = obj2.numDecodings(s);
        System.out.println(result);
        System.out.println(result2);
    }
}