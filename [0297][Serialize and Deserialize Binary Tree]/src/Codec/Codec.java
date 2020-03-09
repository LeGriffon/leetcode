package Codec;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        this.val = x;
    }
}

public class Codec {
    public String serialize(TreeNode root) {
        return serializePreorder(root, "");
    }

    private String serializePreorder(TreeNode root, String str) {
        if(root == null) {
            str += "null,";
        }
        else {
            str += String.valueOf(root.val);
            str = serializePreorder(root.left, str);
            str = serializePreorder(root.right, str);
        }
        return str;
    }

    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        LinkedList<String> list = new LinkedList<>(Arrays.asList(arr));
        return deserializePreorder(list);
    }

    private TreeNode deserializePreorder(LinkedList<String> list) {
        if(list.get(0).equals("null")) {
            list.remove(0);
            return null;
        }
        else {
            TreeNode node = new TreeNode(Integer.valueOf(list.get(0)));
            list.remove(0);
            node.left = deserializePreorder(list);
            node.right = deserializePreorder(list);
            return node;
        }
    }


}