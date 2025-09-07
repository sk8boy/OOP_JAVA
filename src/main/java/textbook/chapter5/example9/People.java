package textbook.chapter5.example9;

public class People extends Anthropoid {
    char m = 'A';
    int n = 60;

    void computer(int a, int b) {
        int c = a + b;
        System.out.println(a + "加" + b + "等于" + c);
    }

    void crySpeak(String s) {
        System.out.println(m + "**" + s + "**" + m);
    }
}
