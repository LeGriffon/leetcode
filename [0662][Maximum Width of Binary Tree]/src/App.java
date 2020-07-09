public class App {
    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(1, new TreeNode(3, new TreeNode(5, new TreeNode(6), null), null), new TreeNode(2, null, new TreeNode(9, null, new TreeNode(7))));
        Solution obj = new Solution();
        int result = obj.widthOfBinaryTree(root);
        System.out.println(result);
    }
}
