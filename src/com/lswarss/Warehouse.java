package com.lswarss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by: LSWarss
 * Date: 29/03/2020
 * Time: 12:59
 **/
public class Warehouse implements Observable {

    private Set<Producer> producers = new HashSet<>();
    private Set<Customer> customers = new HashSet<>();

    public List<Integer> getCapacity() {
        return capacity;
    }

    public void setCapacity(List<Integer> capacity) {
        this.capacity = capacity;
    }

    private List<Integer> capacity = new ArrayList<>();

    @Override
    public void notifyProducers() {
        for(Producer prod : producers){
            prod.update(this);
        }
    }

    @Override
    public void notifyCustomers() {
        for(Customer cust : customers){
            cust.update(this);
        }
    }

    @Override
    public void registerCustomers(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void registerProducers(Producer producer) {
        producers.add(producer);
    }
}
