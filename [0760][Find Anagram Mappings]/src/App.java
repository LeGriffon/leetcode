public class App {
    public static void main(String[] args) throws Exception {
        int[] A = new int[] {12, 28, 46, 32, 50};
        int[] B = new int[] {50, 12, 32, 46, 28};
        Solution obj = new Solution();
        int[] result = obj.anagramMappings(A, B);
        for(int num : result) {
            System.out.println(num);
        }
    }
}
