import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int nums[] = {1,2,3};
        Solution obj = new Solution();
        List<List<Integer>> result = obj.subsets(nums);
        for(List<Integer> l : result) {
            System.out.println(l);
        }
    }
}