class Solution {
    TreeNode x = null, y = null, prev = null;
    public void recoverTree(TreeNode root) {
        findSwappedNodes(root);
        swap(x, y);
    }
    
    private void findSwappedNodes(TreeNode node) {
        if(node == null) return;
        findSwappedNodes(node.left);
        if(prev != null && prev.val > node.val) {
            y = node;
            if(x == null) x = prev;
            else return;
        }
        prev = node;
        findSwappedNodes(node.right);
    }
    
    private void swap(TreeNode x, TreeNode y) {
        int temp = x.val;
        x.val = y.val;
        y.val = temp;
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