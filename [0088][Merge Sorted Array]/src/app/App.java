package app;

public class App {
    public static void main(String[] args) throws Exception {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m = 3;
        int n = 3;
        Solution obj = new Solution();
        obj.merge(nums1, m, nums2, n);
        for(int k : nums1) {
            System.out.print(k + ", ");
        }
    }
}