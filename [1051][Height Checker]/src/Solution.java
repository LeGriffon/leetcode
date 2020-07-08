import java.util.*;

class Solution {
    public int heightChecker(int[] heights) {
        int[] heightsSorted = heights.clone();
        Arrays.sort(heightsSorted);
        int count = 0;
        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != heightsSorted[i]) count++;
        }
        return count;
    }
}