package app;
import FreqStack.*;

public class App {
    public static void main(String[] args) throws Exception {
        FreqStack obj = new FreqStack();
        obj.push(5);
        obj.push(7);
        obj.push(5);
        obj.push(7);
        obj.push(4);
        obj.push(5);
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
    }
}