public class App {
    public static void main(String[] args) throws Exception {
        int[][] prerequisites = {
            {1, 0},
            {2, 1}
        };
        int numCourses = 3;
        Solution obj = new Solution();
        boolean result = obj.canFinish(numCourses, prerequisites);
        System.out.println(result);
    }
}
