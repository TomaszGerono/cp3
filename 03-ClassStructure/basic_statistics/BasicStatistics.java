package basic_statistics;

public class BasicStatistics {
    static int numberOfItemsInRange(int x, int y) {
        return y - x + 1;
    }

    static int sumOfNumberInRange(int x, int y) {

        int sum = 0;

        for (int i = x; i <= y; i++) {
            sum += i;
        }

        return sum;
    }

    static int meanOfNumbersInRange(int x, int y) {
        return sumOfNumberInRange(x, y) / numberOfItemsInRange(x, y);
    }
}
