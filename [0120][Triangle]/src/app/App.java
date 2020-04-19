package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] triangleArray = {
            {2},
            {3,4},
            {6,5,7},
            {4,1,8,3}
        };
        List<List<Integer>> triangle = new ArrayList<>();
        for (int[] row : triangleArray) {
            triangle.add(new ArrayList<>());
            for(int n : row) {
                triangle.get(triangle.size() - 1).add(n);
            }
        }
        Solution obj = new Solution();
        int result = obj.minimumTotal(triangle);
        System.out.println(result);
    }
}