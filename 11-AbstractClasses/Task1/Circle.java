package Task1;



public class Circle extends Shape {
    
    private int r;

    public Circle(int r) {
        this.r = r;
    }
    
    public double area() {
        return Math.round(Math.PI * Math.pow(r, 2));
    }

    public double perimeter() {
        return Math.round(2 * Math.PI * r);
    }
    


}
