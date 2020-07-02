import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        dfsHelper(root, 0, result);
        return result;
    }
    
    private void dfsHelper(TreeNode node, int level, List<List<Integer>> result) {
        if(result.size() == level) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(node.val);
        if(node.left != null) dfsHelper(node.left, level + 1, result);
        if(node.right != null) dfsHelper(node.right, level + 1, result);
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