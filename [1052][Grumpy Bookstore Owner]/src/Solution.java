class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int satisfied = 0;
        int maxSatisfied = 0;
        int windowSatisfied = 0;
        for(int i = 0; i < customers.length; i++) {
            if(grumpy[i] == 0) satisfied += customers[i];
            else windowSatisfied += customers[i];
            if(i >= X) {
                windowSatisfied -= grumpy[i - X] == 1 ? customers[i - X] : 0;
            }
            maxSatisfied = Math.max(maxSatisfied, windowSatisfied);
        }
        return satisfied + maxSatisfied;
    }
}