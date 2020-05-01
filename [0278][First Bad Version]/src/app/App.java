package app;

public class App {
    public static void main(String[] args) throws Exception {
        Solution obj = new Solution(5, 4);
        int result = obj.firstBadVersion(5);
        System.out.println(result);
    }
}