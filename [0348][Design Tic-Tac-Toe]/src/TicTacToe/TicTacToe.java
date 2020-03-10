package TicTacToe;
import java.lang.Math;

public class TicTacToe {
    private int size;
    private int rows[];
    private int cols[];
    private int diaganol;
    private int antidiaganol;

    public TicTacToe(int n){
        this.size = n;
        this.rows = new int[n];
        this.cols = new int[n];
        this.diaganol = 0;
        this.antidiaganol = 0;
    }

    public int move(int row, int col, int player) {
        System.out.println("Player " + player + " makes move at " +"[" + row + ", " + col + "]");
        int toAdd = player == 1 ? 1 : -1;

        this.rows[row] += toAdd;
        this.cols[col] += toAdd;

        if(row == col) {
            this.diaganol += toAdd;
        }

        if(row + col == this.size - 1) {
            this.antidiaganol += toAdd;
        }

        if(Math.abs(this.rows[row]) == size ||
        Math.abs(this.cols[col]) == size ||
        Math.abs(this.diaganol) == size ||
        Math.abs(this.antidiaganol) == size) {
            System.out.println("Winner is player: " + player);
            return player;
        }
        System.out.println("No one wins: return 0");
        return 0;
    }
}