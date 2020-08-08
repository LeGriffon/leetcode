import java.util.*;

public class Solution {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        
        Map<Integer, List<Integer>> colMap = new HashMap<>();
        Deque<TreeNode> nodeQueue = new LinkedList<>();
        Deque<Integer> colQueue = new LinkedList<>();
        
        nodeQueue.offer(root);
        colQueue.offer(0);
        
        int minCol = 0;
        int maxCol = 0;
        
        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.poll();
            int col = colQueue.poll();
            
            colMap.computeIfAbsent(col, k -> new ArrayList<>()).add(node.val);
            
            if(col < minCol) minCol = col;
            if(col > maxCol) maxCol = col;
            
            if(node.left != null) {
                nodeQueue.offer(node.left);
                colQueue.offer(col - 1);
            }
            
            if(node.right != null) {
                nodeQueue.offer(node.right);
                colQueue.offer(col + 1);
            }
        }
        
        for(int i = minCol; i <= maxCol; i++) {
            result.add(new ArrayList<>(colMap.get(i)));
        }
        return result;
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