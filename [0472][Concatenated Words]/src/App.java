import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String[] words = new String[]{"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
        Solution obj = new Solution();
        List<String> result = obj.findAllConcatenatedWordsInADict(words);
        System.out.println(result);
    }
}
