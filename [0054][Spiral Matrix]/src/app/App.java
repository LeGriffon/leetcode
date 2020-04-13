package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };
        Solution obj = new Solution();
        List<Integer> result = obj.spiralOrder(matrix);
        for(int n : result) {
            System.out.print(n);
        }
    }
}