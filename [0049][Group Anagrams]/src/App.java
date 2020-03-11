import java.util.*;

public class App {
    public static void main(String args[]) throws Exception {
        Solution obj = new Solution();
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = obj.groupAnagrams(strs);
        for (List<String> l1 : result) {
            for (String n : l1) {
                System.out.print(n + " "); 
            }
            System.out.println();
         } 
    }
}