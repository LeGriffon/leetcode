class Solution {
    public int fib(int N) {
        if(N <= 1) return N;
        if(N == 2) return 1;
        
        int curr = 0;
        int prev1 = 1;
        int prev2 = 1;
        
        for(int i = 3; i <= N; i++) {
            curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        return curr;
    }
}