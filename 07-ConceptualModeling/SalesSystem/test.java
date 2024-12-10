package SalesSystem;
import java.time.LocalDate;
import java.util.ArrayList;


public class test {
    public static void main(String[] args) {
        
        Product computer_monitor = new Product("HP 22x", "China", LocalDate.of(2020, 05, 12), 0.25, 60, 40, 60);
        Product keyboard = new Product("SPC GK540 TKL", "China", LocalDate.of(2020, 11, 05), 1.5, 30, 10, 3);

        Seller bitkomputer = new Seller("BitKomputer", "Josepha Conrada 37");
        Customer jan = new Customer("Jan Kowalski", "Kraków, ul. Grochowska 20 31-519");

        bitkomputer.setCustomer(jan);
        jan.setSeller(bitkomputer);


        ArrayList<Product> products_to_add = new ArrayList<>();
        products_to_add.add(computer_monitor);
        products_to_add.add(keyboard);

        ArrayList<Integer> product_quantities_to_add = new ArrayList<>();
        product_quantities_to_add.add(56);
        product_quantities_to_add.add(272);

        bitkomputer.setProducts(products_to_add);
        bitkomputer.setProductQuantities(product_quantities_to_add);

        for (String element : bitkomputer.getProducts()) {
            System.out.println(element.toString());
        }

        System.out.println(bitkomputer.getProductQuantities());

        
    }
}
