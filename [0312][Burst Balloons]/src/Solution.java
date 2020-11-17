class Solution {
    public int maxCoins(int[] nums) {
        int array[] = new int[nums.length + 2];
        int i = 1;
        for(int num : nums) {
            array[i++] = num;
        }
        array[0] = 1;
        array[array.length - 1] = 1;
        int[][] memo = new int[array.length][array.length];
        return burst(array, memo, 0, array.length - 1);
    }
    
    private int burst(int[] array, int[][] memo, int left, int right) {
        if(left + 1 == right) return 0;
        if(memo[left][right] > 0) return memo[left][right];
        int result = 0;
        for(int i = left + 1; i < right; i++) {
            int temp = array[i] * array[left] * array[right] + burst(array, memo, left, i) + burst(array, memo, i, right);
            result = Math.max(result, temp);
        }
        memo[left][right] = result;
        return result;
    }
}