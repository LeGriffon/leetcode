package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] deck = {17,13,11,2,3,5,7};
        Solution obj = new Solution();
        int[] result = obj.deckRevealedIncreasing(deck);
        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}