class Solution {
    public int maxSubarraySumCircular(int[] A) {
        if(A.length == 1) return A[0];
        int arraySum = 0;
        int ans1 = Integer.MIN_VALUE;
        int curr = Integer.MIN_VALUE;
        for(int n : A) {
            arraySum += n;
            curr = n + Math.max(curr, 0);
            ans1 = Math.max(ans1, curr);
        }
        int ans2 = Integer.MAX_VALUE;
        curr = Integer.MAX_VALUE;
        for(int i = 1; i < A.length - 1; i++) {
            curr = A[i] + Math.min(curr, 0);
            ans2 = Math.min(ans2, curr);
        }
        ans2 = arraySum - ans2;
        return Math.max(ans1, ans2);
    }
}