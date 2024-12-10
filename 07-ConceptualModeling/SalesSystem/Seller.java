package SalesSystem;
import java.util.ArrayList;

public class Seller {
    private String sellerName;
    private String SellerAddress;
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Integer> product_quantities = new ArrayList<>();
    private Customer customer;




    public void transaction(Product product) {
        int index_of_product = this.products.indexOf(product);
        this.product_quantities.remove(index_of_product);
        this.products.remove(product);
    }



    public void transaction(ArrayList<Product> products) {
        for (Product element : products) {
            int index_of_product = this.products.indexOf(element);
            this.product_quantities.remove(index_of_product);
            this.products.remove(element);
        }
    }


    
    @Override
    public String toString() {
        return "Seller [sellerName=" + sellerName + ", SellerAddress=" + SellerAddress + ", products=" + products
                + ", product_quantities=" + product_quantities + ", customer=" + customer + "]";
    }



    public Seller(String sellerName, String sellerAddress) {
        this.sellerName = sellerName;
        SellerAddress = sellerAddress;
    }




    public String getSellerName() {
        return sellerName;
    }



    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }



    public String getSellerAddress() {
        return SellerAddress;
    }



    public void setSellerAddress(String sellerAddress) {
        SellerAddress = sellerAddress;
    }



    public String[] getProducts() {

        String[] products_output = new String[this.products.size()];

        for (int i = 0; i < this.products.size() ; i++) {
            products_output[i] = this.products.get(i).toString();
        }

        return products_output;
    }



    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }



    public ArrayList<Integer> getProductQuantities() {
        return product_quantities;
    }



    public void setProductQuantities(ArrayList<Integer> product_quantities) {
        this.product_quantities = product_quantities;
    }



    public Customer getCustomer() {
        return customer;
    }



    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    
}
