import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String s = "cbaebabacd", p = "abc";
        Solution obj = new Solution();
        List<Integer> result = obj.findAnagrams(s, p);
        System.out.println(result);
    }
}
