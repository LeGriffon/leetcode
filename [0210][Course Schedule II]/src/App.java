public class App {
    public static void main(String[] args) throws Exception {
        int[][] prerequisites = {
            {1, 0},
            {2, 0},
            {3, 1},
            {3, 2}
        };
        int numCourses = 4;
        Solution obj = new Solution();
        int[] result = obj.findOrder(numCourses, prerequisites);
        for(int n : result) {
            System.out.println(n);
        }
    }
}
