package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        Solution obj = new Solution();
        List<List<String>> result = obj.findDuplicate(paths);
        System.out.println(result);
    }
}