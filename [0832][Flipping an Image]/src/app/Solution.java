package app;

public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int cols = A[0].length;
        for(int[] row : A) {
            int start = 0, end = cols - 1;
            while(start <= end) {
                int temp = row[start] ^ 1;
                row[start] = row[end] ^ 1;
                row[end] = temp;
                start++;
                end--;
            }
        }
        return A;
    }
}