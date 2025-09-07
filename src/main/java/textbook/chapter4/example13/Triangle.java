package textbook.chapter4.example13;

public class Triangle {
    double sideA, sideB, sideC;
    boolean isTriange;

    public Triangle(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
        isTriange = a + b > c && a + c > b && c + b > a;
    }

    public void 计算面积() {
        if (isTriange) {
            double p = (sideA + sideB + sideC) / 2.0;
            double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
            System.out.println("是一个三角形,面积是:" + area);
        } else {
            System.out.println("不是一个三角形,不能计算面积");
        }
    }

    public void 修改三边(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
        isTriange = a + b > c && a + c > b && c + b > a;
    }
}

