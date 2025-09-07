package textbook.chapter6.example9.tom.data;

public class Circle {
    double radius;

    public void setRadius(double r) {
        radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
} 
