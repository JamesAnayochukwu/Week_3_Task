
package org.example;

import Entity.Customer;
import ServiceImp.ServiceFifoImp;
import ServiceImp.ServiceQueueImp;

public class Main {

    public static void main(String[] args) {

// Create store

//        Store store = new Store();

//Create Customer
        Customer customer1 = new Customer("Adebowale", "Debo@gmail.com", "White - Men's S/S Crew Tee - Small",50);

        Customer customer2 = new Customer("Gabriel", "Gabriel@gmail.com", "White - Men's S/S Crew Tee - Large",70);

        Customer customer3 = new Customer("James", "James@gmail.com", "Charcoal - Men's S/S Crew Tee - Large",20);

        Customer customer4 = new Customer("Pius", "pius@gmail.com", "White - Men's S/S Crew Tee - Small",80);


// FIFO Implementation

        StoreService fifoImp = new ServiceFifoImp();


// Instantiate the queue

        fifoImp.instantiateQueue();


//Adding customers to the queue

        fifoImp.addCustomerToQueue(customer1);

        fifoImp.addCustomerToQueue(customer2);

        fifoImp.addCustomerToQueue(customer3);

        fifoImp.addCustomerToQueue(customer4);


//processing Sales

        System.out.println("***********DISPLAYING RESULTS FOR FIFO IMPLEMENTATION**********");

        fifoImp.processSales();


//PRIORITY QUEUE IMPLEMENTATION

        StoreService priorityImpl = new ServiceQueueImp();

// Instantiate the queue

        priorityImpl.instantiateQueue();


        priorityImpl.addCustomerToQueue(customer1);

        priorityImpl.addCustomerToQueue(customer2);

        priorityImpl.addCustomerToQueue(customer3);

        priorityImpl.addCustomerToQueue(customer4);


//processing Sales

        System.out.println("***********DISPLAYING RESULTS FOR PRIORITY QUEUE IMPLEMENTATION**********");

        priorityImpl.processSales();

    }

}