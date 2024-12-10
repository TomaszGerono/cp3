package SalesSystem;
import java.time.LocalDate;

public class Product {
    private String name;
    private String country_of_origin;
    private LocalDate date_of_prod;
    private double weight_in_kg;
    private int dimension_x;
    private int dimension_y;
    private int dimension_z;


    public Product(String name, String country_of_origin, LocalDate date_of_prod, double weight_in_kg, int dimension_x,
            int dimension_y, int dimension_z) {
        this.name = name;
        this.country_of_origin = country_of_origin;
        this.date_of_prod = date_of_prod;
        this.weight_in_kg = weight_in_kg;
        this.dimension_x = dimension_x;
        this.dimension_y = dimension_y;
        this.dimension_z = dimension_z;
    }

    
    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getCountry_of_origin() {
        return country_of_origin;
    }


    public void setCountry_of_origin(String country_of_origin) {
        this.country_of_origin = country_of_origin;
    }


    public LocalDate getDate_of_prod() {
        return date_of_prod;
    }


    public void setDate_of_prod(LocalDate date_of_prod) {
        this.date_of_prod = date_of_prod;
    }


    public double getWeight_in_kg() {
        return weight_in_kg;
    }


    public void setWeight_in_kg(int weight_in_kg) {
        this.weight_in_kg = weight_in_kg;
    }



    public void setDimensions(int x, int y, int z) {
        if (x > 0 && y > 0 && z > 0) {
            this.dimension_x = x;
            this.dimension_y = y;
            this.dimension_z = z;
        }
    }

    

    public int[] getDimensions() {
        int[] dimensions = {this.dimension_x, this.dimension_y, this.dimension_z};
        return dimensions;
    }


    @Override
    public String toString() {
        return "Product [name=" + name + ", country_of_origin=" + country_of_origin + ", date_of_prod=" + date_of_prod
                + ", weight_in_kg=" + weight_in_kg + ", dimension_x=" + dimension_x + ", dimension_y=" + dimension_y
                + ", dimension_z=" + dimension_z + "]";
    }


    
}
