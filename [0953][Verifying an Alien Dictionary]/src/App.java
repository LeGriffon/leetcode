public class App {
    public static void main(String[] args) throws Exception {
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        Solution obj = new Solution();
        boolean result = obj.isAlienSorted(words, order);
        System.out.println(result);
    }
}
