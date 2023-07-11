package org.example;

import Entity.Customer;
import Entity.Store;

public interface StoreService {
    void instantiateQueue();

    void addCustomerToQueue(Customer customer);

    void processSales();

    String purchaseProduct (Store store);
}
 