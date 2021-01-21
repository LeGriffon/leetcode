import java.util.*;

class Solution {
    int[][] directions = new int[][] {{2, 1}, {1, 2}, {2, -1}, {1, -2}, {-2, 1}, {-1, 2}, {-2, -1}, {-1, -2}};
    public int minKnightMoves(int x, int y) {
        if(x == 0 && y == 0) return 0;
        x = Math.abs(x);
        y = Math.abs(y);
        
        Set<String> visited = new HashSet<>();
        visited.add("0,0");
        
        int steps = 0;
        Deque<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0, 0});
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int[] position = queue.remove();
                if(position[0] == x && position[1] == y) return steps;
                for(int[] direction : directions) {
                    int newX = position[0] + direction[0];
                    int newY = position[1] + direction[1];
                    if(!visited.contains(newX + "," + newY) && (newX >= -1 && newY >= -1)) {
                        queue.add(new int[] {newX, newY});
                        visited.add(newX + "," + newY);
                    }
                }
            }
            steps++;
        }
        return 0;
    }
}