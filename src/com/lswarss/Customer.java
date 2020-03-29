package com.lswarss;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by: LSWarss
 * Date: 29/03/2020
 * Time: 13:01
 **/
public class Customer implements Observer {

    private Warehouse warehouse = null;

    public Customer(Warehouse warehouse){
        this.warehouse = warehouse;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(arg == warehouse){
            for(int products : warehouse.getCapacity()){
                System.out.println(products);
            }
            warehouse.getCapacity().clear();
        }
    }
}
