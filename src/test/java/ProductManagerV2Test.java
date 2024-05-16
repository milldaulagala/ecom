import org.example.ProductManagerV2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
