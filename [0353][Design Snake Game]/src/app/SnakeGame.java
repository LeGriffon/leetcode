package app;

import java.util.*;

class SnakeGame {
    Set<Integer> set;
    Deque<Integer> body;
    int score;
    int width;
    int height;
    int foodIndex;
    int[][] food;
    public SnakeGame(int width, int height, int[][] food) {
        this.set = new HashSet<>();
        this.body = new LinkedList<>();
        this.score = 0;
        this.width = width;
        this.height = height;
        this.foodIndex = 0;
        this.food = food;
        set.add(0);
        body.offerFirst(0);
    }
    public int move(String direction) {
        if(score == -1) {
            return -1;
        }

        int rowHead = body.peekFirst() / width;
        int colHead = body.peekFirst() % width;

        switch(direction) {
            case "U":
            rowHead--;
            break;
            
            case "D":
            rowHead++;
            break;

            case "L":
            colHead--;
            break;

            case "R":
            colHead++;
            break;
        }

        int head = rowHead * width + colHead;
        set.remove(body.peekLast());
        if(rowHead < 0 || rowHead >= height || colHead < 0 || colHead >= width || set.contains(head)) {
            return -1;
        }
        set.add(head);
        body.offerFirst(head);

        if(foodIndex < food.length && rowHead == food[foodIndex][0] && colHead == food[foodIndex][1]) {
            set.add(body.peekLast());
            foodIndex++;
            return ++score;
        }

        else {
            body.pollLast();
            return score;
        }
    }
}