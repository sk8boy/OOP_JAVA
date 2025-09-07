package textbook.chapter4.example22.my.app;

import textbook.chapter4.example22.data.one.Circle;
import textbook.chapter4.example22.data.two.Circular;
import textbook.chapter4.example21.sohu.com.TestOne;

public class Example4_22 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Circular circular = new Circular(circle, 20);
        System.out.println("圆锥的体积:" + circular.getVolume());
        TestOne a = new TestOne();
        a.fTestOne();
    }
}

