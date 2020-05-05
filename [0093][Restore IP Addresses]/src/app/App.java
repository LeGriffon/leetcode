package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String s = "25525511135";
        Solution obj = new Solution();
        List<String> result = obj.restoreIpAddresses(s);
        System.out.println(result);
    }
}