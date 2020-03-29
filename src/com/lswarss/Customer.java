package com.lswarss;

/**
 * Created by: LSWarss
 * Date: 29/03/2020
 * Time: 13:01
 **/
public class Customer implements Observer {

    @Override
    public void update(Warehouse warehouse) {
        for(int products : warehouse.getCapacity()){
            System.out.println(products);
        }
        warehouse.getCapacity().clear();
    }
}
