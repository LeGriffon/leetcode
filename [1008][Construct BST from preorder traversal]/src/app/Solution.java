package app;

public class Solution {
    private int index = 0;
    private int[] preorder;
    private int length;

    public TreeNode bstFromPreorder(int[] preorder) {
        this.preorder = preorder;
        this.length = preorder.length;
        return helperBSTFromPreorder(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode helperBSTFromPreorder(int lower, int upper) {
        if(this.index == this.length) return null;
        int val = this.preorder[this.index];
        if(val < lower || val > upper) {
            return null;
        }
        this.index++;
        TreeNode root = new TreeNode(val);
        root.left = helperBSTFromPreorder(lower, val);
        root.right = helperBSTFromPreorder(val, upper);

        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}