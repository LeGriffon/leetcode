public class App {
    public static void main(String[] args) throws Exception {
        String secret = "1807", guess = "7810";
        Solution obj = new Solution();
        String result = obj.getHint(secret, guess);
        System.out.println(result);
    }
}
