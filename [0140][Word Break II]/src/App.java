import java.util.Arrays;
import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        String s = "catsanddog";
        List<String> wordDict = new ArrayList<>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
        Solution obj = new Solution();
        List<String> result = obj.wordBreak(s, wordDict);
        System.out.println(result);
    }
}
