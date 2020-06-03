import java.util.*;

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - a[1] - (b[0] - b[1]);
            }
        });

        int half = costs.length / 2;
        int totalCost = 0;
        for(int i = 0; i < half; i++) {
            totalCost += costs[i][0] + costs[i + half][1];
        }
        return totalCost;
    }
}