package app;

public class App {
    public static void main(String[] args) throws Exception {
        HitCounter counter = new HitCounter();
        // hit at timestamp 1.
        counter.hit(1);

        // hit at timestamp 2.
        counter.hit(2);

        // hit at timestamp 3.
        counter.hit(3);

        // get hits at timestamp 4, should return 3.
        int result = counter.getHits(4);
        System.out.println(result);
        // hit at timestamp 300.
        counter.hit(300);

        // get hits at timestamp 300, should return 4.
        result = counter.getHits(300);
        System.out.println(result);

        // get hits at timestamp 301, should return 3.
        result = counter.getHits(301); 
        System.out.println(result);
        
    }
}