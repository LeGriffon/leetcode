package app;

public class App {
    public static void main(String[] args) throws Exception {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        Solution obj = new Solution();
        String result = obj.convert(s, numRows);
        System.out.println(result);
    }
}