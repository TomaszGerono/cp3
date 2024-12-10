public class test {
    public static void main(String[] args) {

        String[] input_list = {"Eggs", "Water", "Milk", "Cucumbers"};

        ShoppingList myList = new ShoppingList(input_list);
        myList.addProduct("Orange Juice");

        String[] new_input_list = {"Strawberries", "Kale", "Tomatoes", "Breadrolls", "Butter"};
        myList.addProducts(new_input_list);
        System.out.println(myList.getListOfProducts());

    
    }
}
