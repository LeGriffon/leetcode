import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String S = "ababcbacadefegdehijhklij";
        Solution obj = new Solution();
        List<Integer> result = obj.partitionLabels(S);
        System.out.println(result);
    }
}
