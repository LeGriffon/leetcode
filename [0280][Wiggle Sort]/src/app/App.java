package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {3,5,2,1,6,4};
        Solution obj = new Solution();
        obj.wiggleSort(nums);
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}