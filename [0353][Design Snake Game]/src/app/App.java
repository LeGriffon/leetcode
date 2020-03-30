package app;

public class App {
    public static void main(String[] args) throws Exception {
        int width = 3;
        int height = 2;
        int[][] food = {
                        {1, 2},
                        {0, 1}
                    };
        SnakeGame obj = new SnakeGame(width, height, food);
        int score_1 = obj.move("R");
        System.out.println(score_1);
        score_1 = obj.move("D");
        System.out.println(score_1);
        score_1 = obj.move("R");
        System.out.println(score_1);
        score_1 = obj.move("U");
        System.out.println(score_1);
        score_1 = obj.move("L");
        System.out.println(score_1);
        score_1 = obj.move("U");
        System.out.println(score_1);
    }
}