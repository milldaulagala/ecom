package org.example;


public class ProductManager {

    private final String[] itemName = new String[100];
    private final String[] itemDescription = new String[100];

    private final int[] itemPrice = new int[100];

    private int count = 0;

    public boolean addProduct(String item, String type, int price, int discount) {

        itemName[count] = item;
        itemDescription[count] = type;
        itemPrice[count] = price;
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
        // we only search the existing number of items in the array using count variable.

        for (int i = 0; i < count; i++) {

           // if (itemName[i] != null) {

                if (itemName[i].equalsIgnoreCase(productName)) {
                    result = itemName[i];
                    break;
                }
         //   }
        }
        //}

        return result;
    }

    public String searchByProductDescription(String productDesc) {

        String result = "NotFound";

        //if (productDesc != null) {

            for (int i = 0; i < count; i++) {

                //if (itemName[i] != null) {

                    if (itemDescription[i].equalsIgnoreCase(productDesc)) {
                        result = itemDescription[i];
                        break;
                    }
                //}
            }
        //}

        return result;
    }

    public String searchByProductDescriptionReturnName(String productDesc) {

        String name = "NotFound";


        for (int i = 0; i < count; i++) {

            if (itemDescription[i].equalsIgnoreCase(productDesc)) {
                name = itemName[i];
                break;
            }

        }
        return name;
    }

    public int searchByProductDescriptionReturnPrice(String productDesc) {

        int result = 0;

        for (int i = 0; i < count; i++) {

            if (itemDescription[i].equalsIgnoreCase(productDesc)) {
                result = itemPrice[i];
                break;
            }

        }
        return result;

    }
}
