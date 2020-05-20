public class App {
    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4));
        int k = 3;
        Solution obj = new Solution();
        int result = obj.kthSmallest(root, k);
        System.out.println(result);
    }
}
