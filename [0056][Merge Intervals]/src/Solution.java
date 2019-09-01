import java.util.*;

public class Solution {
	/*
	 * The idea is to sort the intervals by their starting points. Then, we take the
	 * first interval and compare its end with the next intervals starts. As long as
	 * they overlap, we update the end to be the max end of the overlapping
	 * intervals. Once we find a non overlapping interval, we can add the previous
	 * "extended" interval and start over. Sorting takes O(n log(n)) and merging the
	 * intervals takes O(n). So, the resulting algorithm takes O(n log(n)). A lambda
	 * comparator (Java 8) and a for-each loop are used to try to keep the code
	 * clean and simple.
	 */
	public int[][] merge(int[][] intervals) {
		if (intervals.length <= 1) {
			return intervals;
		}
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

		List<int[]> res = new ArrayList<>();
		int start = intervals[0][0];
		int end = intervals[0][1];

		for (int[] interval : intervals) {
			if (interval[0] <= end) {
				end = Math.max(interval[1], end);
			} else {
				res.add(new int[] { start, end });
				start = interval[0];
				end = interval[1];
			}
		}
		res.add(new int[] { start, end });
		return res.toArray(new int[res.size()][]);
	}
}
