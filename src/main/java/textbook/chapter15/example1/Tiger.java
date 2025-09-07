package textbook.chapter15.example1;

public class Tiger extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print("|老虎" + i);
            try {
                sleep(1000);
            } catch (Exception exp) {
            }
        }
    }
}

