package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] rooms = {
                        {2147483647,-1,0,2147483647},
                        {2147483647,2147483647,2147483647,-1},
                        {2147483647,-1,2147483647,-1},
                        {0,-1,2147483647,2147483647}
                    };
        Solution obj = new Solution();
        obj.wallsAndGates(rooms);
        for(int[] arr : rooms) {
            for(int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
    }
}