package LRUCache;

import java.util.*;

public class LRUCache extends LinkedHashMap<Integer, Integer>{
    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
        System.out.println("Constructed a LRUCache with capcaity: " + capacity);
    }

    public int get(int key) {
        int value = (int) super.getOrDefault(key, -1);
        System.out.println("Get: " + key + ", returned: " + value);
        return value;
    }

    public void put(int key, int value) {
        System.out.println("Put: Key-" + key + ", Value-" + value);
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        if(size() > capacity) {
            System.out.println("Remove the oldest: " + eldest);
        }
        return size() > capacity;
    }
}