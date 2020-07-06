public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {17,18,5,4,6,1};
        Solution obj = new Solution();
        obj.replaceElements(arr);
        for(int n : arr) {
            System.out.print(n + " ");
        }
    }
}
