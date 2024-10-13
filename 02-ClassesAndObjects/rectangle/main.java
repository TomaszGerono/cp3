package rectangle;

public class main {
    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle();
        firstRectangle.setHeight(3);
        firstRectangle.setWidth(4);

        firstRectangle.displayDimensions();
        firstRectangle.displayPerimeter();
        firstRectangle.displaySurfaceArea();



        Rectangle secondRectangle = new Rectangle();
        secondRectangle.setHeight(2);
        secondRectangle.setWidth(7);

        secondRectangle.displayDimensions();
        secondRectangle.displayPerimeter();
        secondRectangle.displaySurfaceArea();
    }
}
