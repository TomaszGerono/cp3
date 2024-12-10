package SalesSystem;
import java.util.ArrayList;


public class Customer {
    private String customer_name;
    private String customer_address;
    private ArrayList<Product> bought_products = new ArrayList<>();
    private ArrayList<Integer> bought_products_quantities = new ArrayList<>();
    private Seller seller;

    public void transaction(Product product) {
        this.bought_products.add(product);
    }

    public void transaction(ArrayList<Product> products) {
        for (Product element : products) {
            this.bought_products.add(element);
        }
    }


    public Customer(String customer_name, String customer_address) {
        this.customer_name = customer_name;
        this.customer_address = customer_address;
    }



    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public ArrayList<Product> getBought_products() {
        return bought_products;
    }

    public void setBought_products(ArrayList<Product> bought_products) {
        this.bought_products = bought_products;
    }

    public ArrayList<Integer> getBought_products_quantities() {
        return bought_products_quantities;
    }

    public void setBought_products_quantities(ArrayList<Integer> bought_products_quantities) {
        this.bought_products_quantities = bought_products_quantities;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    
} 
