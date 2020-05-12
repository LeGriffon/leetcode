package app;

public class App {
    public static void main(String[] args) throws Exception {
        int image[][] = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr = 1, sc = 1, newColor = 2;
        Solution obj = new Solution();
        obj.floodFill(image, sr, sc, newColor);
        for(int[] row : image) {
            for(int n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}