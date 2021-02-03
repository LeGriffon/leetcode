public class App {
    public static void main(String[] args) throws Exception {
        int height = 5;
        int width = 7;
        int[] tree = new int[]{2, 2};
        int[] squirrel = new int[]{4, 4};
        int[][] nuts = new int[][] {{3, 0}, {2,5}};
        Solution obj = new Solution();
        int result = obj.minDistance(height, width, tree, squirrel, nuts);
        System.out.println(result);
    }
}
