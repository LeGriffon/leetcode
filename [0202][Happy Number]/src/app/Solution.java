package app;

public class Solution {
    public boolean isHappy(int n) {
        int turtle = n;
        int rabbit = nextInt(n);
        while(rabbit != 1 && turtle != rabbit) {
            turtle = nextInt(turtle);
            rabbit = nextInt(nextInt(rabbit));
        }
        return rabbit == 1;
    }

    private int nextInt(int n) {
        int totalSum = 0;
        while(n > 0) {
            int digit = n % 10;
            n /= 10;
            totalSum += digit * digit;
        }
        return totalSum;
    }
}