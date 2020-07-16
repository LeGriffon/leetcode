class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if(N < 0) {
            N = -N;
            x = 1 / x;
        }
        double result = 1;
        double currentProduct = x;
        for(long i = N; i > 0; i /= 2) {
            if(i % 2 == 1) {
                result *= currentProduct;
            }
            currentProduct = currentProduct * currentProduct;
        }
        return result;
    }
}