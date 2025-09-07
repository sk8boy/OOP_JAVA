package textbook.chapter9.example6;

import java.util.Date;

public class Example9_6 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Student zhang = new Student("Zhang San");
        System.out.println(zhang);
        System.out.println(new Student("Li Xiao"));
    }
}
