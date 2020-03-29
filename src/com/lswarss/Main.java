package com.lswarss;

import java.util.Collections;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Producer producer = new Producer(warehouse1);
        Customer customer = new Customer(warehouse1);

        warehouse1.addObserver(producer);
        warehouse1.addObserver(customer);
        warehouse1.setCapacity(Collections.singletonList(100));

        while(true){
            if(!warehouse1.getCapacity().isEmpty()){
                warehouse1.notifyObservers();
            }
            if(warehouse1.getCapacity().isEmpty()){
                warehouse1.notifyObservers();
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
