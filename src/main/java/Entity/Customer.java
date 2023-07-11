package Entity;

public class Customer {
    private String customerName;
    private String customerID;
    private String itemToPurchase;
    private int quantityToPurchase;

    public Customer(String customerName, String customerID, String itemToPurchase, int quantityToPurchase) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.itemToPurchase = itemToPurchase;
        this.quantityToPurchase = quantityToPurchase;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getItemToPurchase() {
        return itemToPurchase;
    }

    public void setItemToPurchase(String itemToPurchase) {
        this.itemToPurchase = itemToPurchase;
    }

    public int getQuantityToPurchase() {
        return quantityToPurchase;
    }

    public void setQuantityToPurchase(int quantityToPurchase) {
        this.quantityToPurchase = quantityToPurchase;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerID='" + customerID + '\'' +
                ", itemToPurchase='" + itemToPurchase + '\'' +
                ", quantityToPurchase=" + quantityToPurchase +
                '}';
    }
}