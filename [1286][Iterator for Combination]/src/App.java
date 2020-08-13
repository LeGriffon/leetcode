public class App {
    public static void main(String[] args) throws Exception {
        CombinationIterator obj = new CombinationIterator("abc", 2);
        String param_1 = obj.next();
        System.out.println(param_1);
        System.out.println(obj.hasNext());
        String param_2 = obj.next();
        System.out.println(param_2);
        String param_3 = obj.next();
        System.out.println(param_3);
        System.out.println(obj.hasNext());
    }
}
