package com.lswarss;

import java.util.*;

/**
 * Created by: LSWarss
 * Date: 29/03/2020
 * Time: 12:59
 **/
public class Warehouse extends Observable {

    public List<Integer> getCapacity() {
        return capacity;
    }

    public void setCapacity(List<Integer> capacity) {
        this.capacity = capacity;
        setChanged();
        notifyObservers();
    }

    private List<Integer> capacity = new ArrayList<>();




}
