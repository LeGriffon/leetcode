class Solution {
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        int left = 0, right = A.length - 1;
        int index = A.length - 1;
        while(left <= right) {
            int leftSquare = A[left] * A[left];
            int rightSquare = A[right] * A[right];
            if(leftSquare > rightSquare) {
                result[index--] = leftSquare;
                left++;
            }
            else {
                result[index--] = rightSquare;
                right--;
            }
        }
        return result;
    }
}