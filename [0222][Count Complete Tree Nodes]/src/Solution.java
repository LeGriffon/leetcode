class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int d = findDepth(root);
        if(d == 0) return 1;
        int left = 1, right = (int) Math.pow(2, d) - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(exist(root, d, mid)) left = mid + 1;
            else right = mid - 1;
        }
        return (int) Math.pow(2, d) - 1 + left;
    }
    
    private int findDepth(TreeNode root) {
        int depth = 0;
        while(root.left != null) {
            root = root.left;
            depth++;
        }
        return depth;
    }
    
    private boolean exist(TreeNode node, int depth, int index) {
        int left = 0, right = (int) Math.pow(2, depth) - 1;
        for(int i = 0; i < depth; i++) {
            int mid = left + (right - left) / 2;
            if(index <= mid) {
                node = node.left;
                right = mid;
            }
            else {
                node = node.right;
                left = mid + 1;
            }
        }
        return node != null;
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