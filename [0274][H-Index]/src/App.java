public class App {
    public static void main(String[] args) throws Exception {
        int[] citations = {3,0,6,1,5};
        Solution obj = new Solution();
        int result = obj.hIndex(citations);
        System.out.println(result);
    }
}
