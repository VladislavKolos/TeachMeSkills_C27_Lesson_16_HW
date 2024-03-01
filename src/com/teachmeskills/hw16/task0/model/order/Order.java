package com.teachmeskills.hw16.task0.model.order;

/**
 * "Order" type class
 * contains four private fields
 * contains one constructor
 * contains getters and setters for each of the fields
 * overridden "toString" method.
 */
public class Order {
    private String productName;
    private double price;
    private String description;
    private boolean priority;

    public Order(String productName, double price, String description, boolean priority) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.priority = priority;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }
}
