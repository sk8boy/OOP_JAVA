package textbook.chapter5.example7;

public class Sum {
    int n;

    public double f() {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
