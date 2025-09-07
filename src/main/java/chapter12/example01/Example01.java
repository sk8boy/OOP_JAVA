package chapter12.example01;

import java.io.IOException;
import java.io.InputStream;

public class Example01 {
    public static void main(String[] args) throws IOException {
        int b = 0, i = 0;
        byte[] buffer = new byte[50];
        InputStream stdin = System.in;
        while (true) {
            try {
                b = stdin.read();
                buffer[i++] = (byte) b;
                if (b == (int) '#') break;
                System.out.print(b + " ");    //以字节为单位输出
                if (b == 10) System.out.println();    //'\n'换行
                //stdin.close();
            } catch (IOException ie) {
                System.out.println("异常发生");
            }
        }
        System.out.println("键盘输入：\n" + new String(buffer));
    }
}