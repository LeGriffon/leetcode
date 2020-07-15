public class App {
    public static void main(String[] args) throws Exception {
        char[] s = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
        Solution obj = new Solution();
        obj.reverseWords(s);
        for(char ch : s) {
            System.out.print(ch + " ");
        }
    }
}
