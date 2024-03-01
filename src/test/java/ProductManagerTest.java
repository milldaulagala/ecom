import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.ProductManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductManagerTest {
    @Test
    public void testAddProductCountSuccess(){
        //given
        ProductManager pm = new ProductManager();
        //when
        boolean result = pm.addProduct("Fan", "5 speed Fan", 15, 0);
        boolean result1 = pm.addProduct("Fan", "5 speed Fan", 15, 0);
        boolean result2 = pm.addProduct("Fan", "5 speed Fan", 15, 0);

        //then
        Assertions.assertTrue(result);
        Assertions.assertTrue(result1);
        Assertions.assertTrue(result2);

        Assertions.assertTrue(pm.getNumberOfProducts()>0);
        assertEquals(3, pm.getNumberOfProducts());
    }

    @Test
    public void testAddProductGetSuccess() {

        //Given
        ProductManager pm = new ProductManager();
        boolean result = pm.addProduct("laptop","computer",1000,10);
        boolean result1 = pm.addProduct("monitor","computer",1000,10);

        //When
        String name1 = pm.getProduct(0);
        String name2 = pm.getProduct(1);

        //Then
        assertTrue(result);
        assertTrue(result1);
        assertEquals("laptop",name1);
        assertEquals("monitor",name2);
    }
}
