import java.util.*;
import javafx.util.Pair;

class Solution {
    Robot robot;
    int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    Set<Pair<Integer, Integer>> visited = new HashSet<>();
    
    public void cleanRoom(Robot robot) {
        this.robot = robot;
        backtrack(0, 0, 0);
    }
    
    private void goBack() {
        this.robot.turnRight();
        this.robot.turnRight();
        this.robot.move();
        this.robot.turnRight();
        this.robot.turnRight();
    }
    
    public void backtrack(int row, int col, int direction) {
        visited.add(new Pair(row, col));
        this.robot.clean();
        for(int i = 0; i < 4; i++) {
            int newDirection = (direction + i) % 4;
            int newRow = row + this.directions[newDirection][0];
            int newCol = col + this.directions[newDirection][1];
            if(!this.visited.contains(new Pair(newRow, newCol)) && this.robot.move()) {
                backtrack(newRow, newCol, newDirection);
                goBack();
            }
            this.robot.turnRight();
        }
    }
}