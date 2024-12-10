import java.util.ArrayList;

public class ShoppingList {
    
    private ArrayList<String> list_of_products = new ArrayList<>();

    public ShoppingList(String[] input_list) {
        for (String element : input_list) {
            this.list_of_products.add(element);
        }
    }

    public void addProduct(String product) {
        list_of_products.add(product);
    }

    public void removeProduct(String product) {
        list_of_products.remove(product);
    }

    public void addProducts(String[] input_list) {
        for (String element : input_list) {
            this.list_of_products.add(element);
        }
    }

    public void removeProducts(String[] input_list) {
        for (String element : input_list) {
            this.list_of_products.remove(element);
        }
    }

    public ArrayList<String> getListOfProducts() {
        return list_of_products;
    }

    public void setListOfProducts(ArrayList<String> list_of_products) {
        this.list_of_products = list_of_products;
    }

}