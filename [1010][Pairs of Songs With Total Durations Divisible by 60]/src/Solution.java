class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] remainders = new int[60];
        int result = 0;
        for(int t : time) {
            int target = (60 - t % 60) % 60;
            result += remainders[target];
            remainders[t % 60]++;
        }
        return result;
    }
}