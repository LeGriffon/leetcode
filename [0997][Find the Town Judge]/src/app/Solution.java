package app;

public class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] indegress = new int[N + 1];
        int[] outdegrees = new int[N + 1];
        for(int[] relation : trust) {
            outdegrees[relation[0]]++;
            indegress[relation[1]]++;
        }
        for(int i = 0; i <= N; i++) {
            if(outdegrees[i] == 0 && indegress[i] == N - 1) {
                return i;
            }
        }
        return -1;
    }
}