package com.lswarss;

/**
 * Created by: LSWarss
 * Date: 29/03/2020
 * Time: 13:01
 **/
public class Producer implements Observer{

    private static int counter = 1;

    @Override
    public void update(Warehouse warehouse) {
        warehouse.getCapacity().add(counter++);
    }
}
