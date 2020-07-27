public class App {
    public static void main(String[] args) throws Exception {
        String s = "ab", t = "acb";
        Solution obj = new Solution();
        boolean result = obj.isOneEditDistance(s, t);
        System.out.println(result);
    }
}
