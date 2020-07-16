class Solution {
    public int findKthLargest(int[] nums, int k) {
        quicksort(nums, 0, nums.length - 1);
        int index = nums.length - k;
        return nums[index];
    }
    
    private void quicksort(int[] nums, int left, int right) {
        if(left < right) {
            int partitionIndex = partition(nums, left, right);
            quicksort(nums, left, partitionIndex - 1);
            quicksort(nums, partitionIndex + 1, right);
        }
    }
    
    private int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int partitionIndex = left;
        for(int i = left; i < right; i++) {
            if(nums[i] < pivot) {
                swap(nums, partitionIndex, i);
                partitionIndex++;
            }
        }
        swap(nums, partitionIndex, right);
        return partitionIndex;
    }
    
    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}