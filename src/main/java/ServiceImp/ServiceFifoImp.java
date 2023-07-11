package ServiceImp;

import Entity.Customer;
import Entity.Store;
import org.example.StoreService;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceFifoImp implements StoreService {
    private Queue<Customer> queue;

    public static void processSales(Queue<Customer> customerQueue) {
    }

    @Override
    public void instantiateQueue() {
        queue = new LinkedList<>();
    }

    @Override
    public void addCustomerToQueue(Customer customer) {
        queue.add(customer);
    }


    @Override
    public void processSales() {
        try {
            if (!queue.isEmpty()) {
                for (Customer customer : queue) {
                    System.out.println("Processing sale for customer: " + customer.getCustomerName());
                }
            } else {
                System.out.println("No customers in the queue.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong : " + e.getStackTrace()[0].toString());
        }

    }

    @Override
    public String purchaseProduct(Store store) {
        return null;
    }
}
 