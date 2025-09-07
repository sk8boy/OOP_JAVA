import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example12_17 {
    public static void main(String[] args) {
        File file = new File("student.txt");
        Scanner sc = null;
        int count = 0;
        double sum = 0;
        try {
            int score = 0;
            sc = new Scanner(file);
            while (sc.hasNext()) {
                try {
                    score = sc.nextInt();
                    count++;
                    sum = sum + score;
                    System.out.println(score);
                } catch (InputMismatchException exp) {
                    String t = sc.next();
                }
            }
            double aver = sum / count;
            System.out.println("平均成绩:" + aver);
        } catch (FileNotFoundException exp) {
            System.out.println(exp);
        }

    }
}
