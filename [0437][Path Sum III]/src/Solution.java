import java.util.*;

public class Solution {
    int count = 0;
    Map<Integer, Integer> map = new HashMap<>();
    
    public int pathSum(TreeNode root, int sum) {
        dfsHelper(root, 0, sum);
        return count;
    }
    
    private void dfsHelper(TreeNode node, int currSum, int target) {
        if(node == null) return;
        
        currSum += node.val;
        if(currSum == target) {
            count++;
        }
        count += map.getOrDefault(currSum - target, 0);
        map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        
        dfsHelper(node.left, currSum, target);
        dfsHelper(node.right, currSum, target);
        map.put(currSum, map.get(currSum) - 1);
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