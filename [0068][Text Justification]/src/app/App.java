package app;
import Solution.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Solution obj = new Solution();
        String[] words = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
        List<String> result = obj.fullJustify(words, 16);
        System.out.println(result);
    }
}