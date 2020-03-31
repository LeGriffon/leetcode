package app;

public class App {
    public static void main(String[] args) throws Exception {
        Logger logger = new Logger();
 
        // logging string "foo" at timestamp 1
        boolean result = logger.shouldPrintMessage(1, "foo");
        System.out.println(result);

        // logging string "bar" at timestamp 2
        result = logger.shouldPrintMessage(2,"bar");
        System.out.println(result);

        // logging string "foo" at timestamp 3
        result = logger.shouldPrintMessage(3,"foo");
        System.out.println(result);

        // logging string "bar" at timestamp 8
        result = logger.shouldPrintMessage(8,"bar");
        System.out.println(result);

        // logging string "foo" at timestamp 10
        result = logger.shouldPrintMessage(10,"foo");
        System.out.println(result);

        // logging string "foo" at timestamp 11
        result = logger.shouldPrintMessage(11,"foo");
        System.out.println(result);
    }
}