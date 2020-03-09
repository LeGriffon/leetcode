package MedianFinder;

import java.util.*;

public class MedianFinder{
    Queue<Long> large;
    Queue<Long> small;

    public MedianFinder() {
        this.large = new PriorityQueue<>((a, b) -> (int)(b - a));
        this.small = new PriorityQueue<>();
    }

    public void addNum(int num) {
        large.offer((long)num);
        small.offer(large.poll());
        if(large.size() < small.size()) {
            large.offer(small.poll());
        }
    }

    public double findMedian() {
        return large.size() > small.size() ?
                                            large.peek() :
                                            (large.peek() + small.peek()) * 0.5;
    }
}