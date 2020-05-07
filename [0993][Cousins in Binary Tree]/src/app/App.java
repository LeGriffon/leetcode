package app;

public class App {
    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);
        Solution obj = new Solution();
        boolean result = obj.isCousins(root, 4, 5);
        System.out.println(result);
    }
}