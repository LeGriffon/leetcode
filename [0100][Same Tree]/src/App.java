public class App {
    public static void main(String[] args) throws Exception {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Solution obj = new Solution();
        boolean result = obj.isSameTree(p, q);
        System.out.println(result);
    }
}
