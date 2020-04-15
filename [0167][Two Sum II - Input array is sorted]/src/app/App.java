package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = {2,7,11,15};
        int target = 9;
        Solution obj = new Solution();
        int[] result = obj.twoSum(numbers, target);
        for(int n : result) {
            System.out.println(n);
        }
    }
}