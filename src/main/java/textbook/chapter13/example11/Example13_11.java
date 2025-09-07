package textbook.chapter13.example11;

import java.util.HashSet;
import java.util.Iterator;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Example13_11 {
    public static void main(String[] args) {
        Student zh = new Student("张三", 76),
                wa = new Student("王二", 88),
                li = new Student("李四", 97);
        HashSet<Student> set = new HashSet<Student>();
        HashSet<Student> subset = new HashSet<Student>();
        set.add(zh);
        set.add(wa);
        set.add(li);
        subset.add(wa);
        subset.add(li);
        if (set.contains(wa)) {
            System.out.println("集合set中含有:" + wa.name);
        }
        if (set.containsAll(subset)) {
            System.out.println("集合set包含集合subset");
        }
        int number = subset.size();
        System.out.println("集合subset中有" + number + "个元素:");
        Object[] s = subset.toArray();
        for (int i = 0; i < s.length; i++) {
            System.out.printf("姓名:%s,分数:%d\n", ((Student) s[i]).name, ((Student) s[i]).score);
        }
        number = set.size();
        System.out.println("集合set中有" + number + "个元素:");
        Iterator<Student> iter = set.iterator();
        while (iter.hasNext()) {
            Student te = iter.next();
            System.out.printf("姓名:%s,分数:%d\n", te.name, te.score);
        }
    }
}
