package textbook.chapter12.example16;

import java.io.File;

public class Example12_16 {
    public static void main(String[] args) {
        File file = new File("Example12_15.java");
        WindowFileLock win = new WindowFileLock(file);
        win.setTitle("使用文件锁");
    }
}
