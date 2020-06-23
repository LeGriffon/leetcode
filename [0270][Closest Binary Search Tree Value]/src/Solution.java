
class Solution {
    public int closestValue(TreeNode root, double target) {
        int closest = root.val;
        int curr = root.val;
        while(root != null) {
            curr = root.val;
            closest = Math.abs(curr - target) < Math.abs(closest - target) ? curr : closest;
            root = target < curr ? root.left : root.right;
        }
        return closest;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    TreeNode(int x, TreeNode left, TreeNode right) { this.val = x; this.left = left; this.right = right;}
}
