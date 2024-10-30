package surface_area;

public class SurfaceAreaTest {
    public static void main(String[] args) {
        System.out.println("Surface area of a rectangle 4x5: " + SurfaceArea.rectangle(4,5));
        System.out.println("Surface area of a circle with radius of 3: " + SurfaceArea.circle(3));
        System.out.println("Surface area of a triangle with base 3 and height 4: " + SurfaceArea.triangle(3, 4));
        System.out.println("Surface area of a cuboid 5x6x7: " + SurfaceArea.cuboid(5,6,7) );
        System.out.println("Surface area of a sphere with radius 7: " + SurfaceArea.sphere(7));
        System.out.println("Surface area of a cone with radius of 5 and length 8: " + SurfaceArea.cone(5,8));
    }
}
