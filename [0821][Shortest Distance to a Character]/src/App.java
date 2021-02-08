public class App {
    public static void main(String[] args) throws Exception {
        String s = "loveleetcode"; 
        char c = 'e';
        Solution obj = new Solution();
        int[] result = obj.shortestToChar(s, c);
        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}
