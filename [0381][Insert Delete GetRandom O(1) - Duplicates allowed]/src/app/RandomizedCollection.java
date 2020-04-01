package app;

import java.util.*;

class RandomizedCollection {
    List<Integer> list;
    Map<Integer, Set<Integer>> dict;
    Random rand;
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        this.list = new ArrayList<>();
        this.dict = new HashMap<>();
        this.rand = new Random();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        dict.computeIfAbsent(val, k -> new HashSet<>()).add(list.size());
        list.add(val);
        return dict.get(val).size() == 1;
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if(!dict.containsKey(val)) return false;

        int index = dict.get(val).iterator().next();
        int lastElement = list.get(list.size() - 1);

        list.set(index, lastElement);
        dict.get(lastElement).add(index);
        dict.get(lastElement).remove(list.size() - 1);

        dict.get(val).remove(index);
        list.remove(list.size() - 1);

        return true;
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}