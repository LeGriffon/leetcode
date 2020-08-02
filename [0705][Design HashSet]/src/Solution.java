import java.util.*;

class MyHashSet {
    private Bucket[] bucketArray;
    private int keyRange;
    /** Initialize your data structure here. */
    public MyHashSet() {
        this.keyRange = 769;
        this.bucketArray = new Bucket[this.keyRange];
        for(int i = 0; i < this.keyRange; i++) {
            bucketArray[i] = new Bucket();
        }
    }
    
    public int hash(int key) {
        return key % this.keyRange;
    }
    
    public void add(int key) {
        this.bucketArray[this.hash(key)].insert(key);
    }
    
    public void remove(int key) {
        this.bucketArray[this.hash(key)].delete(key);
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return this.bucketArray[this.hash(key)].exists(key);
    }
}

class Bucket {
    private LinkedList<Integer> container;
    
    public Bucket() {
        this.container = new LinkedList<>();
    }
    
    public void insert(Integer key) {
        if(!this.exists(key)) {
            this.container.addFirst(key);
        }
    }
    
    public void delete(Integer key) {
        if(this.exists(key)) {
            this.container.remove(key);
        }
    }
    
    public boolean exists(Integer key) {
        return this.container.indexOf(key) != -1;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */