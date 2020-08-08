import java.util.*;

public class Solution {
    List<Node<Integer, Integer, Integer>> nodeList = new ArrayList<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        
        dfsHelper(root, 0, 0);
        
        Collections.sort(this.nodeList, new Comparator<Node<Integer, Integer, Integer>>() {
            @Override
            public int compare(Node<Integer, Integer, Integer> n1, Node<Integer, Integer, Integer> n2) {
                if(n1.x.equals(n2.x)) {
                    if(n1.y.equals(n2.y)) {
                        return n1.value.compareTo(n2.value);
                    }
                    else {
                        return n1.y.compareTo(n2.y);
                    }
                }
                else {
                    return n1.x.compareTo(n2.x);
                }
            }
        });
        
        List<Integer> currCol = new ArrayList<>();
        Integer currColIndex = this.nodeList.get(0).x;
        
        for(Node<Integer, Integer, Integer> node : nodeList) {
            if(node.x == currColIndex) {
                currCol.add(node.value);
            }
            else {
                currColIndex = node.x;
                result.add(currCol);
                currCol = new ArrayList<>();
                currCol.add(node.value);
            }
        }
        result.add(currCol);
        return result;
    }
    
    private void dfsHelper(TreeNode node, int x, int y) {
        if(node == null) return;
        this.nodeList.add(new Node(x, y, node.val));
        this.dfsHelper(node.left, x - 1, y + 1);
        this.dfsHelper(node.right, x + 1, y + 1);
    }
}

class Node<E, V, Z> {
    public final E x;
    public final V y;
    public final Z value;
    
    public Node(E x, V y, Z value) {
        this.x = x;
        this.y = y;
        this.value = value;
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