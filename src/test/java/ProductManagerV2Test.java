import org.example.ProductManagerV2;
import org.example.model.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductManagerV2Test {

    @Test
    public void testAddProductSuccess() {
        // given
        String itemName = "Desktop";
        String itemDescription = "Computer Monitor";
        String productType = "Computer";
        int price = 100;
        int discount = 10;

        ProductManagerV2 pm = new ProductManagerV2();
        // when

        boolean isAdded = pm.addProduct(itemName, itemDescription, productType, price, discount);

        // then

        assertTrue(isAdded);
    }

    @Test
    public void testAddAndGetProductSuccess() {
        // given
        String itemName = "Desktop";
        String itemDescription = "Computer Monitor";
        String productType = "Computer";
        int price = 100;
        int discount = 10;

        ProductManagerV2 pm = new ProductManagerV2();
        // when

        boolean isAdded = pm.addProduct(itemName, itemDescription, productType, price, discount);
        boolean isAdded1 = pm.addProduct("Mouse", itemDescription, productType, price, discount);
        Product prod = pm.getProductByName("Desktop");
        Product prod1 = pm.getProductByName("Mouse");

        // then

        assertTrue(isAdded);
        assertTrue(isAdded1);
        assertNotNull(prod);
        assertNotNull(prod1);
        assertEquals("Desktop", prod.getItemName());
        assertEquals("Mouse", prod1.getItemName());
    }
}
