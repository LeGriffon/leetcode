public class App {
    public static void main(String[] args) throws Exception {
        int n = 4;
        int[][]paths = {{1,2},{2,3},{3,4},{4,1},{1,3},{2,4}};
        Solution obj = new Solution();
        int[] result = obj.gardenNoAdj(n, paths);
        for(int num : result) {
            System.out.println(num);
        }
    }
}
