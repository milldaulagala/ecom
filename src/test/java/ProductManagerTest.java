import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.ProductManager;

import java.awt.geom.FlatteningPathIterator;

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
        assertTrue(result);
        assertTrue(result1);
        assertTrue(result2);

        assertTrue(pm.getNumberOfProducts()>0);
        assertEquals(3, pm.getNumberOfProducts());
    }

    @Test
    public void testAddProductGetSuccess() {

        //Given
        ProductManager pm = new ProductManager();
        boolean result = pm.addProduct("laptop","computer",1000,10);
        boolean result1 = pm.addProduct("monitor","computer",1000,10);
        boolean result2 = pm.addProduct("desktop","computer",800,10);


        //When
        String name1 = pm.getProduct(0);
        String name2 = pm.getProduct(1);
        String name3 = pm.getProduct(2);
        int productCount = pm.getNumberOfProducts();


        //Then
        assertTrue(result);
        assertTrue(result1);
        assertEquals("laptop",name1);
        assertEquals("monitor",name2);
        assertEquals("desktop",name3);
        assertEquals(3,productCount);


    }

    @Test
    public void testSearchByProductNameFindProduct() {
        //given
      ProductManager pm = new ProductManager();
      pm.addProduct("laptop", "computer", 1000, 10);
      pm.addProduct("desktop", "computer", 1000, 10);
      pm.addProduct("monitor", "computer", 1000, 10);
      pm.addProduct("keyboard", "computer", 1000, 10);

        //when
    String searchProductName = new String("laptop");
    String productName = pm.searchByProductName(searchProductName);

        //then
    assertEquals("laptop", productName);
    }


    @Test
    public void testSearchByProductNameFindAllProducts() {

        //given
        String[] itemName = {"laptop", "desktop", "keyboard", "monitor"};
        ProductManager pm = new ProductManager();
        pm.addProduct(itemName[0], "computer", 1000, 10);
        pm.addProduct(itemName[1], "computer", 1000, 10);
        pm.addProduct(itemName[2], "computer", 1000, 10);
        pm.addProduct(itemName[3], "computer", 1000, 10);

        //when
        String[]  resultProduct = new String[4];
        int i = 0;
        for (String name : itemName) {
            String productName = pm.searchByProductName(name.toUpperCase());
            resultProduct[i] = productName;
            i++;
        }

        //then
        i = 0;
        for (String name : itemName) {
            assertEquals(name, resultProduct[i]);
            i++;
        }

    }



}
