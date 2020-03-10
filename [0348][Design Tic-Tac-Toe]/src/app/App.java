package app;
import TicTacToe.*;

public class App {
    public static void main(String[] args) throws Exception {
        TicTacToe toe = new TicTacToe(3);
        toe.move(0, 0, 1); // Returns 0 (no one wins)
        toe.move(0, 2, 2); // Returns 0 (no one wins)
        toe.move(2, 2, 1); // Returns 0 (no one wins)
        toe.move(1, 1, 2); // Returns 0 (no one wins)
        toe.move(2, 0, 1); // Returns 0 (no one wins)
        toe.move(1, 0, 2); // Returns 0 (no one wins)
        toe.move(2, 1, 1); // Returns 1 (player 1 wins)
    }
}