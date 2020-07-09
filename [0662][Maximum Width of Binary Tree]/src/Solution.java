import java.util.*; 
 
 class Solution {
    private Map<Integer, Integer> firstColIndexTable;
    private int maxWidth;
    
    public int widthOfBinaryTree(TreeNode root) {
        this.firstColIndexTable = new HashMap<>();
        this.maxWidth = 0;
        dfsHelper(root, 0, 0);
        return this.maxWidth;
    }
    
    private void dfsHelper(TreeNode root, int depth, int index) {
        if(root == null) return;
        if(!firstColIndexTable.containsKey(depth)) {
            firstColIndexTable.put(depth, index);
        }
        int firstColIndex = firstColIndexTable.get(depth);
        this.maxWidth = Math.max(this.maxWidth, index - firstColIndex + 1);
        dfsHelper(root.left, depth + 1, index * 2);
        dfsHelper(root.right, depth + 1, index * 2 + 1);
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