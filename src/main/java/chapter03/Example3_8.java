package chapter03;

public class Example3_8 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        char[] b = {'a', 'b', 'c', 'd'};
        for (int j : a) { //传统方式
            System.out.println(j);
        }
        for (char c : b) { //传统方式
            System.out.println(c);
        }
        for (int i : a) {             //循环变量i依次取数组a的每一个元素的值（改进方式）
            System.out.println(i);
        }
        for (char ch : b) {          //循环变量ch依次取数组b的每一个元素的值（改进方式）
            System.out.println(ch);
        }
    }
}


