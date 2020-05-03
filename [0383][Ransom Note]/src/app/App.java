package app;

public class App {
    public static void main(String[] args) throws Exception {
        String ransomNote = "aa", magazine = "aab";
        Solution obj = new Solution();
        boolean result = obj.canConstruct(ransomNote, magazine);
        System.out.println(result);
    }
}