package chapter02.example4;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int row = 4, column = 3;//行数、列数
        //1. 声明数组
        int[][] matrix;

        //2. 创建数组
        matrix = new int[row][];
        for (int i = 0; i < row; i++) {
            matrix[i] = new int[column];
        }

        //3. 初始化数组
        int firstElement = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = firstElement;
                firstElement++;
                System.out.print(matrix[i][j] + "");
            }
            System.out.println();
        }

        matrix[0] = new int[]{5, 6, 7, 8, 9, 10};
        System.out.println("\n" + Arrays.toString(matrix[0]));
    }
}
