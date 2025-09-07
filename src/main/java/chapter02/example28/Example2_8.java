package chapter02.example28;

import java.util.Scanner;

enum Season {
    SPRING,SUMMER,AUTUMN,WINTER;
}

public class Example2_8 {
    public static void main(String[] args) {
        Season x = null;
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                x = Season.SPRING;
                break;
            case 2:
                x = Season.SUMMER;
                break;
            case 3: x = Season.AUTUMN;
                break;
            case 4: x = Season.WINTER;
        }
        System.out.println(x);
    }
}
