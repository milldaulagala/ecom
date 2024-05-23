package org.example;

import org.example.model.Product;

import java.util.Objects;

public class ProductManagerV2 {

    private final Product[] productStore = new Product[100];
    private int count = 0;

    public boolean addProduct(String itemName, String itemDescription, String productType, int price, int discount) {
        Product product = new Product(itemName, itemDescription, productType, price, discount);
        productStore[count] = product;
        count = count + 1;
        return true;
    }

    public Product getProductByName(String itemName) {

        Product product = null;
        for (int i = 0; i < count; i++) {
            product = productStore[i];
            if (Objects.equals(product.getItemName(), itemName)) {
                product = productStore[i];
                break;
            }
        }
        return product;
    }
}
