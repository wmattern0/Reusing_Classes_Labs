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
        System.out.println("Total value of products on hand: $" + totalValueOfAllProducts);
    }

    public static void getAllProductNames(){
        for (Product product:productsList) {
            System.out.println(product.getID());
        }
    }
}
