package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList(new String[] {"hot","dot","dog","lot","log","cog"});
        Solution obj = new Solution();
        List<List<String>> result = obj.findLadders(beginWord, endWord, wordList);
        for(List<String> l : result) {
            for(String s : l) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}