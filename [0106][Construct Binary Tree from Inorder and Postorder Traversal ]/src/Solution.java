import java.util.*;

public class Solution {
    private int[] inorder;
    private int[] postorder;
    private Map<Integer, Integer> inorderIndexMap = new HashMap<>();
    private int postorderIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        this.postorderIndex = postorder.length - 1;
        for(int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }
        return helper(0, inorder.length - 1);
    }

    private TreeNode helper(int inorderLeft, int inorderRight) {
        if(inorderLeft > inorderRight) return null;
        int rootVal = postorder[postorderIndex--];
        TreeNode root = new TreeNode(rootVal);
        int inorderIndex = inorderIndexMap.get(rootVal);
        root.right = helper(inorderIndex + 1, inorderRight);
        root.left = helper(inorderLeft, inorderIndex - 1);
        return root;
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