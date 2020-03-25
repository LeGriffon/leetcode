package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] routes = {
                            {7, 12},
                            {4, 5, 15},
                            {6},
                            {15,19},
                            {9, 12,13}
                    };
        Solution obj = new Solution();
        int result = obj.numBusesToDestination(routes, 15, 12);
        System.out.println("The least number of buses must take from 1 to 7 is: " + result );
    }
}