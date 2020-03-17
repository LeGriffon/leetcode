package app;

import java.util.*;

public class Solution{
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Deque<Integer> functionIdStack = new LinkedList<>();
        int prevTime = 0;

        for(String log : logs) {
            String[] logStrs = log.split(":");
            int id = Integer.parseInt(logStrs[0]);
            String action = logStrs[1];
            int currTime = Integer.parseInt(logStrs[2]);
            if(action.equals("start")) {
                if(!functionIdStack.isEmpty()) {
                    result[functionIdStack.peek()] += currTime - prevTime;
                }
                functionIdStack.push(id);
                prevTime = currTime;
            }
            else if(action.equals("end")) {
                result[functionIdStack.pop()] += currTime - prevTime + 1;
                prevTime = currTime + 1;
            }
        }
        return result;
    }
}