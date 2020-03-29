package com.lswarss;


/**
 * Created by: LSWarss
 * Date: 29/03/2020
 * Time: 13:12
 **/

public interface Observable {
    void notifyProducers();
    void notifyCustomers();
    void registerCustomers(Customer customer);
    void registerProducers(Producer producer);

}
