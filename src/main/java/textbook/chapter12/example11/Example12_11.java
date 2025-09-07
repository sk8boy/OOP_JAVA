package textbook.chapter12.example11;

import java.io.*;

public class Example12_11 {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream outByte = new ByteArrayOutputStream();
            byte[] byteContent = "How are you".getBytes();
            outByte.write(byteContent);
            ByteArrayInputStream inByte = new ByteArrayInputStream(outByte.toByteArray());
            byte[] backByte = new byte[outByte.toByteArray().length];
            inByte.read(backByte);
            System.out.println(new String(backByte));
            CharArrayWriter outChar = new CharArrayWriter();
            char[] charContent = "您好".toCharArray();
            outChar.write(charContent);
            CharArrayReader inChar = new CharArrayReader(outChar.toCharArray());
            char[] backChar = new char[outChar.toCharArray().length];
            inChar.read(backChar);
            System.out.println(new String(backChar));
        } catch (IOException exp) {
        }
    }
}

