package com.lswarss;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by: LSWarss
 * Date: 29/03/2020
 * Time: 13:01
 **/
public class Producer implements Observer {

    private static int counter = 1;
    private Warehouse warehouse = null;

    public Producer(Warehouse warehouse){
        this.warehouse = warehouse;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(arg == warehouse){
            warehouse.getCapacity().add(counter++);
        }
    }



}
