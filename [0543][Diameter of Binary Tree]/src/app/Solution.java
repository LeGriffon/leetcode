package app;

public class Solution {
    private int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfsHelper(root);
        return maxDiameter;
    }

    private int dfsHelper(TreeNode root) {
        if(root == null) return 0;
        int left = dfsHelper(root.left);
        int right = dfsHelper(root.right);
        maxDiameter = Math.max(maxDiameter, left + right);
        return Math.max(left, right) + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
} 