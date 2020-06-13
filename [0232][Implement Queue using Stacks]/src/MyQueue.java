import java.util.*;

class MyQueue {
    Deque<Integer> input;
    Deque<Integer> output;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        this.input = new LinkedList<>();
        this.output = new LinkedList<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        this.input.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        this.peek();
        return this.output.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if(this.output.isEmpty()) {
            while(!this.input.isEmpty()) {
                this.output.push(this.input.pop());
            }
        }
        return output.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return this.input.isEmpty() && this.output.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */