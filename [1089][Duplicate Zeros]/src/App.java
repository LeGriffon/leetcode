public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,0,2,3,0,4,5,0};
        Solution obj = new Solution();
        obj.duplicateZeros(arr);
        for(int n : arr) {
            System.out.print(n + " ");
        }
    }
}
