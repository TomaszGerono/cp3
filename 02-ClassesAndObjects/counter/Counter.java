package counter;

// attributes: count with initial value = 0
// methods: increaseByOne, decreaseByOne, increaseByTen, decreaseByTen, resetToInitialValue

public class Counter {
    int count = 0;

    public void increaseByOne() {
        count += 1;
    }

    public void decreaseByOne() {
        count -= 1;
    }

    public void increaseByTen() {
        count += 10;
    }

    public void decreaseByTen() {
        count -= 10;
    }

    public void resetToInitialValue() {
        count = 0;
    }
}
