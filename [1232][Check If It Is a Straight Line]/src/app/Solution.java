package app;

public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        for(int i = 2; i < coordinates.length; i++) {
            if(!onTheLine(coordinates[i], coordinates[0], coordinates[1])) {
                return false;
            }
        }
        return true;
    }

    private boolean onTheLine(int[] p, int[] p1, int[] p2) {
        int x = p[0], y = p[1];
        int x1 = p1[0], y1 = p1[1];
        int x2 = p2[0], y2 = p2[1];
        return (y - y1) * (x2 - x1) == (x - x1) * (y2 - y1);
    }
}