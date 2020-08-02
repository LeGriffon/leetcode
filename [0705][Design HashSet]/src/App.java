public class App {
    public static void main(String[] args) throws Exception {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);         
        hashSet.add(2);         
        boolean result1 = hashSet.contains(1);    // returns true
        System.out.println(result1);
        boolean result2 = hashSet.contains(3);    // returns false (not found)
        System.out.println(result2);
        hashSet.add(2);          
        boolean result3 = hashSet.contains(2);    // returns true
        System.out.println(result3);
        hashSet.remove(2);          
        boolean result4 = hashSet.contains(2);    // returns false (already removed)
        System.out.println(result4);
    }
}
