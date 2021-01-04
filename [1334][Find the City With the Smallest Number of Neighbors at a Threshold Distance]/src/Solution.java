import java.util.*;

class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
         int[][] dis = new int[n][n];
        int result = 0;
        int smallest = n;
        
        for(int[] row : dis) {
            Arrays.fill(row, 10001);
        }
        
        for(int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];
            dis[from][to] = weight;
            dis[to][from] = weight;
        }
        
        for(int i = 0; i < n; i++) {
            dis[i][i] = 0;
        }
        
        for(int k = 0; k < n; k++) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    dis[i][j] = Math.min(dis[i][j], dis[i][k] + dis[k][j]);
                }
            }
        }
        
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(dis[i][j] <= distanceThreshold) {
                    count++;
                }
            }
            if(count <= smallest) {
                result = i;
                smallest = count;
            }
        }
        return result;
    }
}