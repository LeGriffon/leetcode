package app;

public class Solution {
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    private int maxGain(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftMax = Math.max(maxGain(root.left), 0);
        int rightMax = Math.max(maxGain(root.right), 0);
        int localMax = root.val + leftMax + rightMax;
        maxSum = Math.max(maxSum, localMax);
        return root.val + Math.max(leftMax, rightMax);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}