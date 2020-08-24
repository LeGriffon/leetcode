public class App {
    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        Solution obj = new Solution();
        int result = obj.sumOfLeftLeaves(root);
        System.out.println(result);
    }
}
