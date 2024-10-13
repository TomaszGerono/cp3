package rectangle;

public class Rectangle {
    int height;
    int width;

    public void setHeight(int x) {
        height = x;
    }

    public void setWidth(int y) {
        width = y;
    }

    public void displayDimensions() {
        System.out.println(height + "x" + width);
    }
    
    public void displaySurfaceArea() {
        System.out.println("Surface area: " + height*width);
    }

    public void displayPerimeter() {
        System.out.println("Perimeter: " + height*2 + width*2);
    }
}
