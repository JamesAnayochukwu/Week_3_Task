package ServiceImp;

import Entity.Customer;
import Entity.Store;
import org.example.StoreService;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ServiceQueueImp implements StoreService {
    private PriorityQueue<Customer> queue;

    private Queue<Customer> normalQueue;

    @Override
    public void instantiateQueue() {
        queue = new PriorityQueue<>(Comparator.comparingInt(Customer::getQuantityToPurchase).reversed());

    }

    @Override
    public void addCustomerToQueue(Customer customer) {
        queue.add(customer);
    }

    @Override
    public void processSales() {
        if (queue.isEmpty()) {
            System.out.println("No customers in the queue.");
            return;
        }

        System.out.println("Processing sales:");
        while (!queue.isEmpty()) {
            Customer customer = queue.poll();
            System.out.println("Sale processed for " + customer.getCustomerName() + " (Quantity to purchase: " + customer.getQuantityToPurchase() + ")");
        }
    }


    @Override
    public String purchaseProduct(Store store) {

        return null;
    }
}
 