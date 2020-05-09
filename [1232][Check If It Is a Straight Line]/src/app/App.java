package app;

public class App {
    public static void main(String[] args) throws Exception {
        int coordinates[][] = {
            {-7,-3},{-7,-1},{-2,-2},{0,-8},{2,-2},{5,-6},{5,-5},{1,7}
        };
        Solution obj = new Solution();
        boolean result = obj.checkStraightLine(coordinates);
        System.out.println(result);
    }
}