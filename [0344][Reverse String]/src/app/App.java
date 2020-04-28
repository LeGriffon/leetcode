package app;

public class App {
    public static void main(String[] args) throws Exception {
        char[] s = {'h','e','l','l','o'};
        Solution obj = new Solution();
        obj.reverseString(s);
        for(char c : s) {
            System.out.print(c + " ");
        }
    }
}