package com.drool.test.product;

/**
 * Created by umesh on 1/12/17.
 */
public class Product {

    private double price;
    private ProductDiscount discount;
   // private List<Double> discount;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public ProductDiscount getDiscount() {
        return discount;
    }

    public void setDiscount(ProductDiscount discount) {
        this.discount = discount;
    }

    public Product(double price, ProductDiscount discount) {
        this.price = price;
        this.discount = discount;
    }
}
