package chapter01;

public class Test {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int number = input.nextInt();
//        System.out.print("Number is: " + number);

        int[] numbers;
        int[] n = {3, 4, 5};
        numbers = n;
        n[2] = 8;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
////        System.out.println(Long.MAX_VALUE);
////        long width1 = 9223372036854775807L;
////        long width2 = 9223372036854775807;
//        float width1 = 12345.123456789f;
//        System.out.println(width1);
////        System.out.printf("%f", width1);
//        float width2 = 87.363f;
//
////        double width1 = 87.363;
////        double width2 = 87.363d;
//        if (width1 == width2) {
//            System.out.println("equals");
//        } else {
//            System.out.println("not equals");
//        }
//
//        int a = 257;
//        byte b = (byte) a;
//        System.out.println("a=" + a);
//        System.out.println("b=" + b);
//
//    }
}
