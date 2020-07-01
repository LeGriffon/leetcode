public class App {
    public static void main(String[] args) throws Exception {
        WordDictionary obj = new WordDictionary();
        obj.addWord("bad");
        obj.addWord("dad");
        obj.addWord("mad");
        boolean result1 = obj.search("pad");
        boolean result2 = obj.search("bad");
        boolean result3 = obj.search(".ad");
        boolean result4 = obj.search("b..");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
