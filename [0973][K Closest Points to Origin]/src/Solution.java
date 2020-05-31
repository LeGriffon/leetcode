import java.util.Arrays;

class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int left = 0, right = points.length - 1;
        while(left <= right) {
            int mid = quickSort(points, left, right);
            if(mid == K) break;
            if(mid < K) left = mid + 1;
            else right = mid - 1;
        }
        return Arrays.copyOfRange(points, 0, K);
    }
    
    private int quickSort(int[][] points, int left, int right) {
        int[] pivot = points[left];
        while(left < right) {
            while(left < right && compare(points[right], pivot) >= 0) right--;
            points[left] = points[right];
            while(left < right && compare(points[left], pivot) <= 0) left++;
            points[right] = points[left];
        }
        points[left] = pivot;
        return left;
    }
    
    private int compare(int[] p1, int[] p2) {
        return p1[0] * p1[0] + p1[1] * p1[1] - (p2[0] * p2[0] + p2[1] * p2[1]);
    }
}