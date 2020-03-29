package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] flights = {
                            {0,1,1},
                            {1,0,1},
                            {1,1,0}
        };
        int[][] days = {
                            {1,3,1},
                            {6,0,3},
                            {3,3,3}
        };

        Solution obj = new Solution();
        int result = obj.maxVacationDays(flights, days);
        System.out.println(result);
    }
}