package textbook.chapter4.example11;

public class Student {
    int number;

    Student(int n) {
        number = n;
    }

    void speak() {
        System.out.println("Student类的包名是tom.jiafei,我的学号：" + number);
    }
}
