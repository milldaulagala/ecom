import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.ProductManager;
public class TestProductManager {
    @Test
    public void testI(){

        ProductManager pm = new ProductManager();
        boolean result = pm.addProduct("Fan", "5 speed Fan", 15, 0);
        Assertions.assertTrue(result);

        int numberOfProducts = pm.getNumberOfProducts();
        Assertions.assertTrue(numberOfProducts>0);

        boolean result1 = pm.addProduct("Fan", "5 speed Fan", 15, 0);
        int numberOfProducts1 = pm.getNumberOfProducts();
        Assertions.assertEquals(2, numberOfProducts1);
    }
}
