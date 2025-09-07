package textbook.chapter12.example10;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

public class Example12_10 {
    public static void main(String[] args) {
        RandomAccessFile in = null;
        try {
            in = new RandomAccessFile("Example12_10.java", "rw");
            long length = in.length();  //获取文件的长度
            long position = 0;
            in.seek(position);       //将读取位置定位到文件的起始
            while (position < length) {
                String str = in.readLine();
                byte[] b = str.getBytes(StandardCharsets.ISO_8859_1);
                str = new String(b);
                position = in.getFilePointer();
                System.out.println(str);
            }
        } catch (IOException e) {
        }
    }
}
