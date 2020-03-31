package app;

public class App {
    public static void main(String[] args) throws Exception {
        // Init an empty set.
        RandomizedSet randomSet = new RandomizedSet();

        // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        boolean bresult = randomSet.insert(1);
        System.out.println(bresult);
        // Returns false as 2 does not exist in the set.
        bresult = randomSet.remove(2);
        System.out.println(bresult);
        // Inserts 2 to the set, returns true. Set now contains [1,2].
        bresult = randomSet.insert(2);
        System.out.println(bresult);
        // getRandom should return either 1 or 2 randomly.
        int iresult = randomSet.getRandom();
        System.out.println(iresult);
        // Removes 1 from the set, returns true. Set now contains [2].
        bresult = randomSet.remove(1);
        System.out.println(bresult);
        // 2 was already in the set, so return false.
        bresult = randomSet.insert(2);
        System.out.println(bresult);
        // Since 2 is the only number in the set, getRandom always return 2.
        iresult = randomSet.getRandom();
        System.out.println(iresult);
    }
}