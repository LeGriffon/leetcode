import java.util.*;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        List<Integer> path = new ArrayList<>();
        dfsHelper(root, path, sum, result);
        return result;
    }
    
    private void dfsHelper(TreeNode node, List<Integer> path, int remainingSum, List<List<Integer>> result) {
        if(node == null) return;
        path.add(node.val);
        if(node.val == remainingSum && node.left == null && node.right == null) {
            result.add(new ArrayList<>(path));
        }
        else {
            dfsHelper(node.left, path, remainingSum - node.val, result);
            dfsHelper(node.right, path, remainingSum - node.val, result);
        }
        path.remove(path.size() - 1);
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