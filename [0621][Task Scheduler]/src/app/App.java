package app;

public class App {
    public static void main(String[] args) throws Exception {
        char[] tasks = {'A','A','A','B','B','B'};
        Solution obj = new Solution();
        int result = obj.leastInterval(tasks, 2);
        System.out.println(result);
    }
}