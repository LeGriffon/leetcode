package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k = 4;
        Solution obj = new Solution();
        List<String> result = obj.topKFrequent(words, k);
        System.out.println(result);
    }
}