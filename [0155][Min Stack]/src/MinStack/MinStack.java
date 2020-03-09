package MinStack;

import java.util.*;

public class MinStack {
    private Deque<Integer> stack;
    private int min;

    public MinStack() {
        this.stack = new LinkedList<>();
        this.min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if(x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.pop() == min) {
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return this.min;
    }
    
}