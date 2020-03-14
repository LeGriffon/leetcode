package app;

import java.util.*;

public class Solution {
    private Map<String, Queue<String>> targets = new HashMap<>();
    private List<String> route = new ArrayList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        for(List<String> l : tickets) {
            targets.computeIfAbsent(l.get(0), k -> new PriorityQueue<>()).add(l.get(1));
        }
        visit("JFK");
        return route;
    }

    private void visit(String airport) {
        while(targets.containsKey(airport) && !targets.get(airport).isEmpty()) {
            visit(targets.get(airport).poll());
        }
        route.add(0, airport);
    }

    public void printRoute() {
        System.out.println(route);
    }
}