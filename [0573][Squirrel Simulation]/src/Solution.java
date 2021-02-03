class Solution {
    public int minDistance(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {
        int result = 0;
        int maxSavingDistance = Integer.MIN_VALUE;
        for(int[] nut : nuts) {
            int treeToNutDistance = distance(tree, nut);
            int nutToSquirrelDistance = distance(squirrel, nut);
            result += (treeToNutDistance * 2);
            maxSavingDistance = Math.max(maxSavingDistance, treeToNutDistance - nutToSquirrelDistance);
        }
        return result - maxSavingDistance;
    }
    
    private int distance(int[] a, int[] b) {
        return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
    }
}