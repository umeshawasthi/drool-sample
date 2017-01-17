package com.drool.test.product;

import java.util.List;

/**
 * Created by umesh on 1/12/17.
 */
public class ProductDiscount {


    private List<Double> discount;

    public ProductDiscount(List<Double> discount) {

        this.discount = discount;
    }

    public List<Double> getDiscount() {
        return discount;
    }

    public void setDiscount(List<Double> discount) {
        this.discount = discount;
    }
}
