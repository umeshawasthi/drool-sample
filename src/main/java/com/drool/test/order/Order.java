package com.drool.test.order;

import java.util.List;

/**
 * Created by umesh on 1/11/17.
 */
public class Order {

    private List<OrderItem> items;

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
}
