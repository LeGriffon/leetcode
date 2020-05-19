import java.util.*;
class StockSpanner {
    Deque<Integer> stack, weights;
    public StockSpanner() {
        this.stack = new LinkedList<>();
        this.weights = new LinkedList<>();
    }
    
    public int next(int price) {
        int weight = 1;
        while(!stack.isEmpty() && stack.peek() <= price) {
            stack.pop();
            weight += weights.pop();
        }
        stack.push(price);
        weights.push(weight);
        return weight;
    }
}