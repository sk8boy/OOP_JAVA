package chapter15.example3;

public class Bank implements Runnable {
    private int number = 0;

    public void setMoney(int money) {
        number = money;
    }
    public void run() {
        while (true) {
            String name = Thread.currentThread().getName();
            if (name.equals("One")) {
                if (number <= 150) {
                    System.out.println(name + "进入死亡状态");
                    return;
                }
                number = number + 10;
                System.out.println("我是" + name + "现在 number = " + number);
            } else if (name.equals("Two")) {
                if (number <= 0) {
                    System.out.println(name + "进入死亡状态");
                    return;
                }
                number = number - 100;
                System.out.println("我是" + name + "现在 number = " + number);
            }

            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
