package com.lswarss;

import java.util.Collections;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Producer producer = new Producer();
        Customer customer = new Customer();

        warehouse1.setCapacity(Collections.singletonList(100));
        warehouse1.registerCustomers(customer);
        warehouse1.registerProducers(producer);

        while(true){
            if(!warehouse1.getCapacity().isEmpty()){
                warehouse1.notifyCustomers();
            }
            if(warehouse1.getCapacity().isEmpty()){
                warehouse1.notifyProducers();
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
