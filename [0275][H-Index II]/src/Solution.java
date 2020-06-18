class Solution {
    public int hIndex(int[] citations) {
        int left = 0, right = citations.length - 1;
        int n = citations.length;
        while(left <= right) {
            int pivot = left + (right - left) / 2;
            if(citations[pivot] == n - pivot) return n - pivot;
            else if(citations[pivot]  < n - pivot) {
                left = pivot + 1;
            }
            else {
                right = pivot - 1;
            }
        }
        return n - left;
    }
}