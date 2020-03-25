package app;

import java.util.*;

public class Solution {
    public boolean judgePoint24(int[] nums) {
        List<Double> list = new ArrayList<>();
        for(int n : nums) {
            list.add((double)n);
        }
        return dfsHelper(list);
    }

    private boolean dfsHelper(List<Double> list) {
        if(list.size() == 1) {
            return Math.abs(list.get(0) - 24) < 0.001;
        }
        for(int i = 0; i < list.size(); i++) {
            for(int j = i + 1; j < list.size(); j++) {
                for(double d : computeNext(list.get(i), list.get(j))) {
                    List<Double> nextRound = new ArrayList<>();
                    nextRound.add(d);
                    for(int k = 0; k < list.size(); k++) {
                        if(k == i || k == j) continue;
                        nextRound.add(list.get(k));
                    }
                    if(dfsHelper(nextRound)) return true;
                }
            }
        }
        return false;
    }

    private List<Double> computeNext(double a, double b) {
        return new ArrayList<Double>(Arrays.asList(a+b, a-b, b-a, a*b, a/b, b/a));
    }
}