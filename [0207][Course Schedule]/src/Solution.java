import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses];
        List<Integer>[] prerPlans = new List[numCourses];

        for(int i = 0; i < numCourses; i++) {
            prerPlans[i] = new ArrayList<>();
        }

        for(int i = 0; i < prerequisites.length; i++) {
            indegrees[prerequisites[i][0]]++;
            prerPlans[prerequisites[i][1]].add(prerequisites[i][0]);
        }

        Deque<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if(indegrees[i] == 0) {
                queue.offer(i);
            }
        }
        
        int edgeCount = prerequisites.length;
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            for(int plan : prerPlans[curr]) {
                indegrees[plan]--;
                edgeCount--;
                if(indegrees[plan] == 0) {
                    queue.offer(plan);
                }
            }
        }
        return edgeCount == 0;
    }
}