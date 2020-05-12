package app;

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int original = image[sr][sc];
        if(image[sr][sc] != newColor) {
            dfsHelper(image, sr, sc, newColor, original);
        }
        return image;
    }

    private void dfsHelper(int[][] image, int row, int col, int newColor, int original) {
        if(row < 0 || row >= image.length || col < 0 || col >= image[0].length) return;
        if(image[row][col] == original) {
            image[row][col] = newColor;
            dfsHelper(image, row + 1, col, newColor, original);
            dfsHelper(image, row - 1, col, newColor, original);
            dfsHelper(image, row, col + 1, newColor, original);
            dfsHelper(image, row, col - 1, newColor, original);
        }
    }
}