class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = root;
        while(node != null) {
            if(node.val > val) {
                if(node.left == null) {
                    node.left = new TreeNode(val);
                    return root;
                }
                else {
                    node = node.left;
                }
            }
            else {
                if(node.right == null) {
                    node.right = new TreeNode(val);
                    return root;
                }
                else {
                    node = node.right;
                }
            }
        }
        return new TreeNode(val);
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
 