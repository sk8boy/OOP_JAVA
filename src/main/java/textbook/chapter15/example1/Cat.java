package textbook.chapter15.example1;

public class Cat extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            //System.out.print("|Сè"+i+"״̬:"+getState()+"|");
            System.out.print("|Сè" + i);
        }
    }
}

