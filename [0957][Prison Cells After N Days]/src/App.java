public class App {
    public static void main(String[] args) throws Exception {
        int[] cells = {0,1,0,1,1,0,0,1};
        int N = 7;
        Solution obj = new Solution();
        int[] result = obj.prisonAfterNDays(cells, N);
        for(int n : result) {
            System.out.print(n + " ");
        }
    }
}
