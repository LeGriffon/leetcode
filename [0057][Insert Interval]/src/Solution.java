import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int index = 0, length = intervals.length;
        int newStart = newInterval[0], newEnd = newInterval[1];
        List<int[]> result = new ArrayList<>();
        
        while(index < length && intervals[index][0] < newStart) {
            result.add(intervals[index++]);
        }
        
        if(result.isEmpty() || result.get(result.size() - 1)[1] < newStart) {
            result.add(newInterval);
        }
        else {
            int[] interval = result.remove(result.size() - 1);
            interval[1] = Math.max(interval[1], newEnd);
            result.add(interval);
        }
        
        while(index < length) {
            int[] interval = intervals[index++];
            if(result.get(result.size() - 1)[1] < interval[0]) {
                result.add(interval);
            }
            else {
                int[] lastInterval = result.remove(result.size() - 1);
                lastInterval[1] = Math.max(lastInterval[1], interval[1]);
                result.add(lastInterval);
            }
        }
        
        return result.toArray(new int[result.size()][2]);
    }
}