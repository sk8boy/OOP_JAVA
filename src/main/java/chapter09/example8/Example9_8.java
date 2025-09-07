package chapter09.example8;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Example9_8 {
    public static void main(String[] args) {
        String str = "abc你我他";
        byte[] d= str.getBytes();       //默认字符编码GB2312
        System.out.println("数组d的长度是(一个汉字占两个字节):"+d.length);

        String s=new String(d, 3, 2);   //输出：你
        System.out.println(s);

        s=new String(d, 7, 2);
        System.out.println(s);    //输出：他

        d = str.getBytes(StandardCharsets.UTF_8); 	//指定字符编码
        System.out.println("d的长度(utf-8编码,一个汉字占3个字节):"+d.length);

        String str1 = "成都世界大运会原定于2022年8月8日至19日举办！";
        String regex="\\D+";		//1或多个非数字字符
        String[] digitWord = str1.split(regex);

        System.out.println(Arrays.toString(digitWord));
        System.out.println(digitWord.length);
    }
}

