package app;

import java.util.*;

public class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(tasks == null || tasks.length == 0) return -1;
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : tasks) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        Queue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));
        pq.addAll(map.entrySet());

        int count = 0;
        while(!pq.isEmpty()){
            List<Map.Entry<Character,Integer>> list = new LinkedList<>();
            int interval = n + 1;
            while(interval > 0 && !pq.isEmpty()) {
                Map.Entry<Character, Integer> entry = pq.poll();
                entry.setValue(entry.getValue() - 1);
                list.add(entry);
                count++;
                interval--;
            }
            for(Map.Entry<Character, Integer> entry : list) {
                if(entry.getValue() > 0) {
                    pq.offer(entry);
                }
            }
            if(pq.isEmpty()) {
                break;
            }
            count += interval;
        }
        return count;
    }
}