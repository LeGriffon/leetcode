package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String[] array = {"hot","dot","dog","lot","log","cog"};
        List<String> wordList = Arrays.asList(array);
        String beginWord = "hit";
        String endWord = "cog";
        Solution obj = new Solution();
        int result = obj.ladderLength(beginWord, endWord, wordList);
        System.out.println(result);
    }
}