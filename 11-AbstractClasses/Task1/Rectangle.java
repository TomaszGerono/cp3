package Task1;

public class Rectangle extends Shape{

    private int x;
    private int y;

    
    
    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double area() {
        return x*y;
    }

    public double perimeter() {
        return (2 * x) + (2 * y);
    }

}
