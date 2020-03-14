package app;

import java.util.*;

public class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> map = new HashMap<>();
        for(int i = 0; i < equations.size(); i++) {
            map.computeIfAbsent(equations.get(i).get(0), k -> new HashMap<>()).put(equations.get(i).get(1), values[i]);
            map.computeIfAbsent(equations.get(i).get(1), k -> new HashMap<>()).put(equations.get(i).get(0), 1/values[i]);
        }
        double[] result = new double[queries.size()];
        for(int i = 0; i < queries.size(); i++) {
            result[i] = dfsHelper(queries.get(i).get(0), queries.get(i).get(1), 1, map, new HashSet<>());
        }
        return result;
    }

    private double dfsHelper(String dividend, String divisor, double currRes, Map<String, Map<String, Double>> map, Set<String> seen) {
        if(!map.containsKey(dividend) || !seen.add(dividend)) return -1;
        if(dividend.equals(divisor)) return currRes;
        Map<String, Double> next = map.get(dividend);
        for(String d : next.keySet()) {
            double result = dfsHelper(d, divisor, currRes * next.get(d), map, seen);
            if(result != -1) return result;
        }
        return -1;
    }
}