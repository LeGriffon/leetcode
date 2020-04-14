package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Solution obj = new Solution();
        List<Integer> result = obj.getRow(4);
        for(int n : result) {
            System.out.print(n);
        }
    }
}