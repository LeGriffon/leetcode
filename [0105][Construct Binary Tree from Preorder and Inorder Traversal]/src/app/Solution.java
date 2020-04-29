package app;

import java.util.*;

public class Solution {
    private int[] preorder;
    private int[] inorder;
    private Map<Integer, Integer> indexMap;
    private int preorderIndex;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        this.indexMap = new HashMap<>();
        this.preorderIndex = 0;
        for(int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        return helper(0, inorder.length);
    }
    
    private TreeNode helper(int inorderLeft, int inorderRight) {
        if(inorderLeft == inorderRight) {
            return null;
        }
        
        TreeNode node = new TreeNode(preorder[preorderIndex++]);
        int inorderIndex = indexMap.get(node.val);
        
        node.left = helper(inorderLeft, inorderIndex);
        node.right = helper(inorderIndex + 1, inorderRight);
        
        return node;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}