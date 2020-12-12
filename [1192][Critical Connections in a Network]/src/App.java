import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<List<Integer>> connections = new ArrayList<>();
        connections.add(Arrays.asList(0, 1));
        connections.add(Arrays.asList(1, 2));
        connections.add(Arrays.asList(2, 0));
        connections.add(Arrays.asList(1, 3));

        int n = 4;
        Solution obj = new Solution();
        List<List<Integer>> result = obj.criticalConnections(n, connections);
        System.out.println(result);
    }
}
