package app;

import java.util.*;

class RandomizedSet {
    Map<Integer, Integer> dict;
    List<Integer> list;
    Random rand;
    public RandomizedSet() {
        this.dict = new HashMap<>();
        this.list = new ArrayList<>();
        this.rand = new Random();
    }

    public boolean insert(int val) {
        if(dict.containsKey(val)) return false;
        dict.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(!dict.containsKey(val)) return false;
        int lastElement = list.get(list.size() - 1);
        int index = dict.get(val);

        dict.put(lastElement, index);
        list.set(index, lastElement);

        dict.remove(val);
        list.remove(list.size() - 1);

        return true;
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}