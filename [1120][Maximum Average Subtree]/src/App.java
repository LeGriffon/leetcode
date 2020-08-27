public class App {
    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(5, new TreeNode(6), new TreeNode(1));
        Solution obj = new Solution();
        double result = obj.maximumAverageSubtree(root);
        System.out.println(result);
    }
}
