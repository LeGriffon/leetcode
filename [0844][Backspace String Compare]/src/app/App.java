package app;

public class App {
    public static void main(String[] args) throws Exception {
        String S = "ab##", T = "c#d#";
        Solution obj = new Solution();
        boolean result = obj.backspaceCompare(S, T);
        System.out.println(result);
    }
}