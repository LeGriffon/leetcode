package app;

import java.util.*;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0) return result;
        int rowStart = 0, rowEnd = matrix.length - 1, colStart = 0, colEnd = matrix[0].length - 1;
        while(rowStart <= rowEnd && colStart <= colEnd) {
            for(int c = colStart; c <= colEnd; c++) result.add(matrix[rowStart][c]);
            for(int r = rowStart + 1; r <= rowEnd; r++) result.add(matrix[r][colEnd]);
            if(rowStart < rowEnd && colStart < colEnd) {
                for(int c = colEnd - 1; c > colStart; c--) result.add(matrix[rowEnd][c]);
                for(int r = rowEnd; r > rowStart; r--) result.add(matrix[r][colStart]);
            }
            rowStart++;
            colStart++;
            rowEnd--;
            colEnd--;
        }
        return result;
    }
}