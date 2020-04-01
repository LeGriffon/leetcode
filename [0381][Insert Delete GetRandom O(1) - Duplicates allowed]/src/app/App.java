package app;

public class App {
    public static void main(String[] args) throws Exception {// Init an empty collection.
        RandomizedCollection collection = new RandomizedCollection();
        
        // Inserts 1 to the collection. Returns true as the collection did not contain 1.
        boolean bresult = collection.insert(1);
        System.out.println(bresult);
        
        // Inserts another 1 to the collection. Returns false as the collection contained 1. Collection now contains [1,1].
        bresult = collection.insert(1);
        System.out.println(bresult);
        
        // Inserts 2 to the collection, returns true. Collection now contains [1,1,2].
        bresult = collection.insert(2);
        System.out.println(bresult);

        // getRandom should return 1 with the probability 2/3, and returns 2 with the probability 1/3.
        int iresult = collection.getRandom();
        System.out.println(iresult);

        // Removes 1 from the collection, returns true. Collection now contains [1,2].
        bresult = collection.remove(1);
        System.out.println(bresult);

        // getRandom should return 1 and 2 both equally likely.
        iresult = collection.getRandom();
        System.out.println(iresult);
    }
}