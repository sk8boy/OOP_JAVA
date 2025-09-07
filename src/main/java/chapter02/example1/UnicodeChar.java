package chapter02.example1;

public class UnicodeChar {
    public static void main(String[] args) {
        char a1 = 'A';
        char a2 = '\u0041';        //'1'的Unicode解码值
        System.out.println((int) a1);
        System.out.println(a2 + "的解码值：" + (int) a2);
        System.out.println((char) 65);
    }
}
