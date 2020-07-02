import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        Solution obj = new Solution();
        List<List<Integer>> result = obj.levelOrder(root);
        System.out.println(result);
    }
}
