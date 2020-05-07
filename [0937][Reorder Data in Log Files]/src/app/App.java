package app;

public class App {
    public static void main(String[] args) throws Exception {
        String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        Solution obj = new Solution();
        String[] result = obj.reorderLogFiles(logs);
        for(String str : result) {
            System.out.println(str);
        }
    }
}