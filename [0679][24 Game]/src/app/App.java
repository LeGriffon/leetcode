package app;

public class App {
    public static void main(String[] args) throws Exception {
        Solution obj = new Solution();
        int[] nums1 = {4, 1, 8, 7};
        boolean num1Res = obj.judgePoint24(nums1);
        System.out.println("nums1 can make 24: " + num1Res);

        int[] nums2 = {1, 2, 1, 2};
        boolean num2Res = obj.judgePoint24(nums2);
        System.out.println("nums2 can make 24: " + num2Res);
    }
}