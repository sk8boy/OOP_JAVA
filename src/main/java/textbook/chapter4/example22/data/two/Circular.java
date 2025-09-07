package textbook.chapter4.example22.data.two;

import textbook.chapter4.example22.data.one.Circle;

public class Circular {
    Circle bottom;
    double height;

    public Circular(Circle c, double h) {
        bottom = c;
        height = h;
    }

    public double getVolume() {
        return bottom.getArea() * height / 3.0;
    }
}

