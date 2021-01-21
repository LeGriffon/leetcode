import java.util.*;
/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int row, int col) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> dimension = binaryMatrix.dimensions();
        int rows = dimension.get(0);
        int cols = dimension.get(1);
        
        int row = rows - 1;
        int col = cols - 1;
        while(row >= 0 && col >= 0) {
            if(binaryMatrix.get(row, col) == 1) {
                col--;
            }
            else {
                row--;
            }
        }
        return (col == cols - 1) ? -1 : col + 1;
    }
}

interface BinaryMatrix {
    List<Integer> dimensions();
    int get(int row, int col);
}