import java.util.*;

public class Solution {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return serializeHelper(root, "");
    }
    
    private String serializeHelper(TreeNode root, String str) {
        if(root == null) {
            str += "null,";
        }
        else {
            str += String.valueOf(root.val) + ",";
            str = serializeHelper(root.left, str);
            str = serializeHelper(root.right, str);
        }
        return str;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        List<String> list = new LinkedList<>(Arrays.asList(arr));
        return deserializeHelper(list);
    }
    
    private TreeNode deserializeHelper(List<String> list) {
        if(list.get(0).equals("null")) {
            list.remove(0);
            return null;
        }
        else {
            TreeNode node = new TreeNode(Integer.valueOf(list.get(0)));
            list.remove(0);
            node.left = deserializeHelper(list);
            node.right = deserializeHelper(list);
            return node;
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;