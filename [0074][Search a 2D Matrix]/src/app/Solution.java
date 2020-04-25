package app;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;
        System.out.println("Target: " + target);
        System.out.println("Left: " + left + ", Right: " + right);
        System.out.println("Starting binary search loop: ");
        int count = 1;
        while(left <= right) {
            System.out.print("Loop: " + count++ + ". Left: " + left + ", Right: " + right);
            int mid = left + (right - left) / 2;
            int midElement = matrix[mid / cols][mid % cols];
            if(midElement == target) return true;
            System.out.println(". Mid: " + mid + " Value: " + midElement);
            if(midElement < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return false;
    }
}