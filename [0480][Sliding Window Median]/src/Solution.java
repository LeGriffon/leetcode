import java.util.*;

public class Solution {
    private Queue<Integer> large = new PriorityQueue<>();
    private Queue<Integer> small = new PriorityQueue<>((a, b) -> b.compareTo(a));

    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] result = new double[nums.length - k + 1];
        int index = 0;
        for(int start = 0, end = 0; end < nums.length; end++) {
            addNum(nums[end]);
            if(large.size() + small.size() == k) {
                result[index++] = findMedian();
                if(!large.remove(nums[start])) small.remove(nums[start]);
                start++;
            }
        }
        return result;
    }

    private void addNum(int num) {
        large.add(num);
        small.add(large.remove());
        if(large.size() < small.size()) {
            large.add(small.remove());
        }
    }

    private double findMedian() {
        return large.size() > small.size() ? (double) large.peek() : ((double) large.peek() + (double) small.peek()) * 0.5;
    }
}