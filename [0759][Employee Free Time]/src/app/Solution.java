package app;

import java.util.*;

public class Solution {
    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        List<Interval> result = new ArrayList<>();
        Queue<Interval> pq = new PriorityQueue<>((a, b) -> (a.start - b.start));
        for(List<Interval> list : schedule) {
            pq.addAll(list);
        }
        Interval curr = pq.poll();

        while(!pq.isEmpty()) {
            if(curr.end < pq.peek().start) {
                result.add(new Interval(curr.end, pq.peek().start));
                curr = pq.poll();
            }
            else {
                if(curr.end < pq.peek().end) {
                    curr = pq.poll();
                }
                else {
                    pq.poll();
                }
            }
        }
        return result;
    }
}