package mattern.william;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/18/17.
 */
public class ProductTest {

    @Test
    public void getProductTotalValue() {
        Product gum = new Product(.5,"Gum", 500);
        double expected = 250, actual = gum.getProductTotalValue();
        assertEquals(expected,actual,0.0);
    }
}