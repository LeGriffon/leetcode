class Solution {
    int length;
    int totalSum;
    int[] prefixSums;
    public Solution(int[] w) {
        this.length = w.length;
        this.totalSum = 0;
        this.prefixSums = new int[this.length];
        for(int i = 0; i < this.length; i++) {
            this.totalSum += w[i];
            this.prefixSums[i] += totalSum;
        }
    }
    
    public int pickIndex() {
        double target = this.totalSum * Math.random();
        int left = 0, right = this.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(prefixSums[mid] == target) return mid;
            else if(prefixSums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left;
    }
}