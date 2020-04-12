package app;

import java.util.*;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> (b - a));
        for(int n : stones) {
            maxHeap.offer(n);
        }
        while(maxHeap.size() > 1) {
            int heaviest1 = maxHeap.poll();
            int heaviest2 = maxHeap.poll();
            if(heaviest1 != heaviest2) {
                maxHeap.offer(heaviest1 - heaviest2);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}