package org.example.model;

public class Product {
    private String itemName;
    private String itemDescription;
    private String productType;
    private int price;
    private int discount;

    public Product(String itemName, String itemDescription, String productType, int price, int discount) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.productType = productType;
        this.price = price;
        this.discount = discount;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getProductType() {
        return productType;
    }

    public int getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }
}
