public class App {
    public static void main(String[] args) throws Exception {
        int[] citations = {0,1,3,5,6};
        Solution obj = new Solution();
        int result = obj.hIndex(citations);
        System.out.println(result);
    }
}
