package mattern.william;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * Created by williammattern on 1/18/17.
 */
public class Product {
    private double price;
    private String ID;
    private double quantity;

    Product(double price, String ID, double quantity){
        this.price = price;
        this.ID = ID;
        this.quantity = quantity;
        addProductToProductList();
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getID() {
        return ID;
    }

    double getProductTotalValue(){
        return this.quantity * this.price;
    }

    public void addProductToProductList(){
        Inventory.productsList.add(this);
    }
}
