package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        Solution obj = new Solution();
        int result = obj.trap(height);
        System.out.println(result);
    }
}