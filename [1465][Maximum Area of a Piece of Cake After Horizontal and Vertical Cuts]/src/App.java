public class App {
    public static void main(String[] args) throws Exception {
        int h = 5, w = 4;
        int[] horizontalCuts = {1,2,4}, verticalCuts = {1,3};
        Solution obj = new Solution();
        int result = obj.maxArea(h, w, horizontalCuts, verticalCuts);
        System.out.println(result);
    }
}
