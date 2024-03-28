package org.example;


public class ProductManager {

    private final String[] itemName = new String[100];
    private int count = 0;

    public boolean addProduct(String item, String type, int price, int discount) {

        itemName[count] = item;
        count = count + 1;
        return true;
    }

    public int getNumberOfProducts() {
        return count;
    }

    public String getProduct(int i) {
        return itemName[i];
    }

    public String searchByProductName(String productName) {

        String result = "NotFound";

        //if (productName != null) {

        for (int i = 0; i < itemName.length; i++) {

            if (itemName[i] != null) {

                if (itemName[i].equalsIgnoreCase(productName)) {
                    result = itemName[i];
                    break;
                }
            }
        }
        //}

        return result;
    }

    public String searchByProductDescription(String productDesc) {

        String result = "NotFound";

        if (productDesc != null) {

            for (int i = 0; i < itemName.length; i++) {

                if (itemName[i] != null) {

                    if (itemName[i].equalsIgnoreCase(productDesc)) {
                        result = itemName[i];
                        break;
                    }
                }
            }
        }

        return result;
    }
}
