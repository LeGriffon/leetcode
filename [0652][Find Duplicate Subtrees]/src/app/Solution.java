package app;

import java.util.*;

public class Solution{
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        postorderHelper(root, new HashMap<>(), result);
        return result;
    }

    private String postorderHelper(TreeNode root, Map<String, Integer> count, List<TreeNode> result) {
        if(root == null) return "#";
        String serial = root.val + "," + postorderHelper(root.left, count, result) + "," + postorderHelper(root.right, count, result);
        if(count.getOrDefault(serial, 0) == 1) result.add(root);
        count.put(serial, count.getOrDefault(serial, 0) + 1);
        return serial;
    }
}