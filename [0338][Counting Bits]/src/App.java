public class App {
    public static void main(String[] args) throws Exception {
        int num = 10;
        Solution obj = new Solution();
        int[] result = obj.countBits(num);
        for(int n : result) {
            System.out.println(n);
        }
    }
}
