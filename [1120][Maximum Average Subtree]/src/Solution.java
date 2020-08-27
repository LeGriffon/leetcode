
 class Solution {
    private double maxAverage = -Double.MAX_VALUE;
    
    public double maximumAverageSubtree(TreeNode root) {
        dfsHelper(root);
        return maxAverage;
    }
    
    private double[] dfsHelper(TreeNode node) {
        if(node == null) return new double[]{0, 0}; // sum, count
        double[] left = dfsHelper(node.left);
        double[] right = dfsHelper(node.right);
        double sum = node.val + left[0] + right[0];
        double count = 1 + left[1] + right[1];
        this.maxAverage = Math.max(this.maxAverage, 1.0 * sum / count);
        return new double[]{sum, count};
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}