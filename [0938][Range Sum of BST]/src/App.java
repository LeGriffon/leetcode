public class App {
    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(10, new TreeNode(5), new TreeNode(15));
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        Solution obj = new Solution();
        int L = 7, R = 15;
        int result = obj.rangeSumBST(root, L, R);
        System.out.println(result);
    }
}
