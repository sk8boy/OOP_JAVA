package textbook.chapter9.example1;

public class Example9_1 {
    public static void main(String[] args) {
        String s1, s2;
        s1 = "we are students";
        s2 = "we are students";
        System.out.println(s1.equals(s2));  //输出结果是：true
        System.out.println(s1 == s2);         //输出结果是：false
        String s3, s4;
        s3 = "how are you";
        s4 = "how are you";
        System.out.println(s3.equals(s4));  //输出结果是：true
        System.out.println(s3 == s4);         //输出结果是：true
    }
}
