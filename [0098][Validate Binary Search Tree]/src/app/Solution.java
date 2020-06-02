package app;

import java.util.*;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        double inorder = -Double.MAX_VALUE;
        while(!stack.isEmpty() || root != null) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(root.val <= inorder) return false;
            root = root.right;
        }
        return false;
    }
}

// Using recursive inorder traversal
// class Solution {
//     Integer inorder = null;
//     public boolean isValidBST(TreeNode root) {
//         if(root == null) return true;
//         boolean left = isValidBST(root.left);
//         if(inorder != null) {
//             if(root.val <= inorder) return false;
//         }
//         inorder = root.val;
//         boolean right = isValidBST(root.right);
//         return left && right;
//     }
// }

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}