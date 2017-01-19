package mattern.william;

import java.util.ArrayList;

/**
 * Created by williammattern on 1/18/17.
 * In collaboration with Gerrod Mozeik.
 */

public class Inventory {
    static double totalValueOfAllProducts;
    static ArrayList<Product> productsList = new ArrayList<Product>();

    static public void getTotalValueOfAllProducts(){
        for (Product product: productsList){
            totalValueOfAllProducts += product.getProductTotalValue();
        }
        System.out.println(totalValueOfAllProducts);
    }

    public static void main(String[] args) {
        Product gum = new Product(.5, "Gum", 1000);
        Product cigarettes = new Product(10, "Cigs", 20);
        productsList.add(gum);
        productsList.add(cigarettes);
        getTotalValueOfAllProducts();
    }
}
