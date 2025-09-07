package textbook.chapter12.example14;

import java.io.Serializable;

public class Student implements Serializable { //实现Serializable接口
    String name = null;
    double height;

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
