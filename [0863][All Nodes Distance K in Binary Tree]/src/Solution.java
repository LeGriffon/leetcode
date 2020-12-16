import java.util.*;

class Solution {
    Map<TreeNode, Integer> map = new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> result = new ArrayList<>();
        findTarget(root, target);
        dfsHelper(root, K, 0, result);
        return result;
    }
    
    private int findTarget(TreeNode root, TreeNode target) {
        if(root == null) return -1;
        if(root == target) {
            map.put(root, 0);
            return 0;
        }
        int left = findTarget(root.left, target);
        if(left >= 0) {
            map.put(root, left + 1);
            return left + 1;
        }
        int right = findTarget(root.right, target);
        if(right >= 0) {
            map.put(root, right + 1);
            return right + 1;
        }
        return -1;
    }
    
    private void dfsHelper(TreeNode root, int K, int length, List<Integer> result) {
        if(root == null) return;
        if(map.containsKey(root)) length = map.get(root);
        if(length == K) {
            result.add(root.val);
        }
        dfsHelper(root.left, K, length + 1, result);
        dfsHelper(root.right, K, length + 1, result);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}