package Entity;

import Entity.Customer;
import Entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Store {

    public static List<Product> products = new ArrayList<>();
    private Map<Product, Integer> inventory;
    private Queue<Customer> customerQueue;

    public Map<Product, Integer> getInventory() {
        return inventory;
    }

    public void setInventory(Map<Product, Integer> inventory) {
        this.inventory = inventory;
    }

    public Queue<Customer> getCustomerQueue() {
        return customerQueue;
    }

    public void setCustomerQueue(Queue<Customer> customerQueue) {
        this.customerQueue = customerQueue;
    }

    public Store(Map<Product, Integer> inventory, Queue<Customer> customerQueue) {
        this.inventory = inventory;
        this.customerQueue = customerQueue;

    }

    @Override
    public String toString() {
        return "Store{" +
                "inventory=" + inventory +
                ", customerQueue=" + customerQueue +
                '}';
    }

}
