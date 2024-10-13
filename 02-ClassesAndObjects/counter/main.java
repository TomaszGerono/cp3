package counter;

public class main {
    public static void main(String[] args) {
        Counter firstCounter = new Counter();
        Counter secondCounter = new Counter();
        
        firstCounter.increaseByTen();
        firstCounter.increaseByTen();
        firstCounter.increaseByOne();
        firstCounter.increaseByOne();
        firstCounter.increaseByOne();

        secondCounter.decreaseByTen();
        secondCounter.decreaseByTen();
        secondCounter.decreaseByTen();
        secondCounter.decreaseByTen();
        secondCounter.decreaseByOne();
        secondCounter.decreaseByOne();
        secondCounter.decreaseByOne();
        secondCounter.decreaseByOne();
        secondCounter.decreaseByOne();
        secondCounter.decreaseByOne();
        secondCounter.decreaseByOne();

        System.out.println("First counter value: " + firstCounter.count);
        System.out.println("Second counter value: " + secondCounter.count);
    }
}
