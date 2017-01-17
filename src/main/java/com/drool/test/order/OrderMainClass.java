package com.drool.test.order;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by umesh on 1/11/17.
 */
public class OrderMainClass {

    public static void main1(String[] args) {

        KieServices kieServices = KieServices.Factory.get();

       KieContainer kieContainer= kieServices.getKieClasspathContainer();

        KieSession kieSession=kieContainer.newKieSession();

        double initialValue=50;
        List<OrderItem> orderItems= new ArrayList<OrderItem>();
        for(int i=0 ; i< 3; i++){
            OrderItem item= new OrderItem();
            item.setValue(initialValue);
            orderItems.add(item);
            initialValue+=100.00;
        }

        Order order = new Order();
        order.setItems(orderItems);

        for(OrderItem item : order.getItems()){
            System.out.println(item.getValue());
        }

        kieSession.insert(order);

        kieSession.fireAllRules();

        for(OrderItem item : order.getItems()){
            System.out.println(item.getValue());
        }
    }
}
