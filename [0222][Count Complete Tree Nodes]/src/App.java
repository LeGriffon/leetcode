public class App {
    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), null));
        Solution obj = new Solution();
        int result = obj.countNodes(root);
        System.out.println(result);
    }
}
