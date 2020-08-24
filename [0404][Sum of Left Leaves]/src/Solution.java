class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        return dfsHelper(root, false);
    }
    
    private int dfsHelper(TreeNode node, boolean isLeft) {
        if(node.left == null && node.right == null){
            return isLeft ? node.val : 0;
        }
        int total = 0;
        if(node.left != null) {
            total += dfsHelper(node.left, true);
        }
        if(node.right != null) {
            total += dfsHelper(node.right, false);
        }
        return total;
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