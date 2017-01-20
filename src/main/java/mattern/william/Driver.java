package mattern.william;

/**
 * Created by williammattern on 1/19/17.
 */
public class Driver {

    public static void main(String[] args) {
        Product gum = new Product(.5, "Gum", 1000);
        Product cigarettes = new Product(10, "Cigs", 20);
        Inventory.getTotalValueOfAllProducts();
    }
}
