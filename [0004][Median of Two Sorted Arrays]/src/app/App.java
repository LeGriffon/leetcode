package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        Solution obj = new Solution();
        double result = obj.findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }
}