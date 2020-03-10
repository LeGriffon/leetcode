package FreqStack;

import java.util.*;

public class FreqStack {
    private Map<Integer, Integer> freq;
    private Map<Integer, Deque<Integer>> group;
    private int maxFreq;

    public FreqStack() {
        this.freq = new HashMap<>();
        this.group = new HashMap<>();
        this.maxFreq = 0;
    }

    public void push(int x) {
        System.out.println("Push: " + x);
        int f = this.freq.getOrDefault(x, 0) + 1;
        freq.put(x, f);
        if(f > maxFreq) {
            maxFreq = f;
        }
        group.computeIfAbsent(f, k-> new LinkedList<>()).push(x);
    }

    public int pop() {
        int x = group.get(maxFreq).pop();
        System.out.println("Pop: " + x);
        freq.put(x, freq.get(x) - 1);
        if(group.get(maxFreq).size() == 0) {
            maxFreq--;
        }
        return x;
    }
}