package surface_area;

public class SurfaceArea{
    static float rectangle(float a, float b) {
        return a * b;
    }

    static float triangle(float base, float height) {
        return (base * height) / 2;
    }

    static float circle(float radius) {
        return (float) Math.PI * radius * radius;
    }

    static float cuboid(float width, float length, float height) {
        return 2 * (width * length + width * height + length * height);
    }

    static float sphere(float radius) {
        return 4 * (float) Math.PI * radius * radius;
    }

    static float cone(float radius, float length) {
        return (float) Math.PI * radius * (radius + length);
    }
}