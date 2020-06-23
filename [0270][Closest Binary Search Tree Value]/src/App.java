public class App {
    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(5));
        Solution obj = new Solution();
        double target = 3.714286;
        int result = obj.closestValue(root, target);
        System.out.println(result);
    }
}
