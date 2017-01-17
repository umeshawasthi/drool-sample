package com.drool.test.state.session;

/**
 * Created by umesh on 12/15/16.
 */
public class BestPrice {

    private int price;
    private double discount;

    public BestPrice(int price, double discount) {
        this.price = price;
        this.discount = discount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
