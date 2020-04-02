package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] height = {1,8,6,2,5,4,8,3,7};
        Solution obj = new Solution();
        int result = obj.maxArea(height);
        System.out.println(result);
    }
}