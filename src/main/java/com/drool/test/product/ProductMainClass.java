package com.drool.test.product;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by umesh on 1/12/17.
 */
public class ProductMainClass {

    public static void main(String[] args) {

        KieServices kieServices = KieServices.Factory.get();

        KieContainer kieContainer = kieServices.getKieClasspathContainer();

        KieSession kieSession = kieContainer.newKieSession();

        double price = 100;
        double ini_discount =10;
        List<Double> productDiscount;
        for (int i =0; i<4 ; i++){
            productDiscount = new ArrayList<Double>();
            for(int j= 0; j< 3; j++){

                productDiscount.add(ini_discount);
                ini_discount+=2;
            }
            ProductDiscount discount = new ProductDiscount(productDiscount);
            Product product = new Product(price,discount );

            kieSession.insert(product);
        }

        kieSession.fireAllRules();

        System.out.println();
    }
}
