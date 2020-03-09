package app;
import MedianFinder.*;
public class App {
    public static void main(String[] args) throws Exception {
        MedianFinder obj = new MedianFinder();
        obj.addNum(1);
        obj.addNum(2);
        System.out.println(obj.findMedian()); // 1.5
        obj.addNum(3); 
        System.out.println(obj.findMedian()); // 2
    }
}