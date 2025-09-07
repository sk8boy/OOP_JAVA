package textbook.chapter5.example14;

public interface Printable {
    int MAX = 100;  //等价写法：int MAX=100;

    void on();   //等价写法：void on();

    float sum(float x, float y);

    default int max(int a, int b) {   //default方法
        return a > b ? a : b;
    }

    static void f() {
        System.out.println("注意是从Java SE 8开始的");
    }
}
