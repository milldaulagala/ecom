package org.example;

public class ProductManager {

    private int count = 0;
    private final String[] itemName = new String[100];

    public boolean addProduct(String item, String type, int price, int discount) {

        itemName[count] = item;
        count = count + 1 ;
        return true;
    }

    public int getNumberOfProducts() {
        return count;
    }

    public String getProduct(int i) {
        return itemName[i];
    }

}
