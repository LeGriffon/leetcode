public class App {
    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
        Solution obj = new Solution();
        boolean result = obj.hasPathSum(root, 22);
        System.out.println(result);
    }
}
