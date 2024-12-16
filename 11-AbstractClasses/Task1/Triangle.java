package Task1;

public class Triangle extends Shape {
    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    public double area() {
        return (a*h) / 2;
    }

    public double perimeter() {
        return (3 * a);
    }

}
