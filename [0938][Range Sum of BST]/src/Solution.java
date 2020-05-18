class Solution {
    int ans;
    public int rangeSumBST(TreeNode root, int L, int R) {
        ans = 0;
        dfsHelper(root, L, R);
        return ans;
    }

    private void dfsHelper(TreeNode node, int L, int R) {
        if(node == null) return;
        if(L <= node.val && node.val <= R) {
            ans += node.val;
        }
        if(L <= node.val) {
            dfsHelper(node.left, L, R);
        }
        if(node.val <= R) {
            dfsHelper(node.right, L, R);
        }
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