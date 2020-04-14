package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Solution obj = new Solution();
        List<List<Integer>> result = obj.generate(5);
        for(List<Integer> l : result) {
            for(int n : l) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}