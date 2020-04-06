package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] heights = {2,1,5,6,2,3};
        Solution obj = new Solution();
        int result = obj.largestRectangleArea(heights);
        System.out.println(result);
    }
}