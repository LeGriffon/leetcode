import java.util.Arrays;

class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        return (int) ((long) findMax(h, horizontalCuts) * findMax(w, verticalCuts)  % 1000000007);
    }
    
    private int findMax(int length, int[] cuts) {
        Arrays.sort(cuts);
        int maxLength = Math.max(cuts[0], length - cuts[cuts.length - 1]);
        for(int i = 1; i < cuts.length; i++) {
            maxLength = Math.max(maxLength, cuts[i] - cuts[i - 1]);
        }
        return maxLength;
    }
}