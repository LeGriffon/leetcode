package app;

import java.util.*;

class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            boolean foundX = false;
            boolean foundY = false;
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode curr = queue.pop();
                if(curr.val == x) foundX = true;
                if(curr.val == y) foundY = true;
                if(curr.left != null && curr.right != null) {
                    if(curr.left.val == x && curr.right.val == y) return false;
                    if(curr.left.val == y && curr.right.val == x) return false;
                }
                if(curr.left != null) queue.offer(curr.left);
                if(curr.right != null) queue.offer(curr.right);
            }
            if(foundX && foundY) return true;
            if(foundX || foundY) return false;
        }
        return false;
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