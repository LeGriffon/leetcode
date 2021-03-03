public class App {
    public static void main(String[] args) throws Exception {
        String keyboard = "pqrstuvwxyzabcdefghijklmno";
        String word = "leetcode";
        Solution obj = new Solution();
        int result = obj.calculateTime(keyboard, word);
        System.out.println(result);
    }
}
