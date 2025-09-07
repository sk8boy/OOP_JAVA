package textbook.chapter6.example6;

public class Example6_6 {
    public static void main(String[] args) {
        People wang = new People(),
                zhang = new People();
        try {
            wang.setAge(180);
            System.out.println(wang.getAge());
        } catch (IntegerException e) {
            System.out.println(e);
        }
        try {
            zhang.setAge(37);
            System.out.println(zhang.getAge());
        } catch (IntegerException e) {
            System.out.println(e);
        }
    }
}
