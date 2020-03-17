package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> logs = Arrays.asList("0:start:0","1:start:2","1:end:5","0:end:6");
        Solution obj = new Solution();
        int[] result = obj.exclusiveTime(2, logs);
        for(int n : result) {
            System.out.println(n);
        }
    }
}