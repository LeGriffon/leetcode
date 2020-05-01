package app;

public class App {
    public static void main(String[] args) throws Exception {
        String address = "255.100.50.0";
        Solution obj = new Solution();
        String result = obj.defangIPaddr(address);
        System.out.println(result);
    }
}