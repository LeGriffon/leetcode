public class App {
    public static void main(String[] args) throws Exception {
        String s = "DDIIDI";
        Solution obj = new Solution();
        int[] result = obj.findPermutation(s);
        for(int n : result) {
            System.out.print(n + " ");
        }
    }
}
