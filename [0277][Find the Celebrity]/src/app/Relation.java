package app;

public class Relation {
    private int[][] adjacencyMatrix;
    
    public Relation(int[][] matrix) {
        this.adjacencyMatrix = matrix;
    }
    boolean knows(int a, int b) {
        if(this.adjacencyMatrix[a][b] == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}