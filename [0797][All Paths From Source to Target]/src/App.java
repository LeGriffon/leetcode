import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] graph = {
                            {1, 2},
                            {3},
                            {3},
                            {}
                        };
        Solution obj = new Solution();
        List<List<Integer>> result = obj.allPathsSourceTarget(graph);
        System.out.println(result);
    }
}
