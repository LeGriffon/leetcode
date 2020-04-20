package app;

import java.util.*;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTreeHelper(0, preorder.length - 1, 0, inorder.length - 1, preorder, inorder, map);
    }

    private TreeNode buildTreeHelper(int preLeft, int preRight, int inLeft, int inRight, int[] preorder, int[] inorder, Map<Integer, Integer> map) {
        if(preLeft > preRight || inLeft > inRight) return null;

        TreeNode node = new TreeNode(preorder[preLeft]);
        int currNodeInorderIndex = map.get(node.val);
        int numNodesOnLeft = currNodeInorderIndex - inLeft;

        node.left = buildTreeHelper(preLeft + 1, preLeft + numNodesOnLeft, inLeft, currNodeInorderIndex - 1, preorder, inorder, map);
        node.right = buildTreeHelper(preLeft + numNodesOnLeft + 1, preRight, currNodeInorderIndex + 1, inRight, preorder, inorder, map);

        return node;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}