import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr1 = {1,2,3,4,5}, arr2 = {1,2,5,7,9}, arr3 = {1,3,4,5,8};
        Solution obj = new Solution();
        List<Integer> result = obj.arraysIntersection(arr1, arr2, arr3);
        System.out.println(result);
    }
}
