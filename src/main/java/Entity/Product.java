package Entity;

public class Product implements Comparable<Product>{
    private String productName;
    private String productColor;
    private String productSize;
    private double productPrice;
    private int availableUnit;

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public Double getProductPrice(String s) {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public int getAvailableUnit() {
        return availableUnit;
    }

    public void setAvailableUnit(int availableUnit) {
        this.availableUnit = availableUnit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productColor='" + productColor + '\'' +
                ", productSize='" + productSize + '\'' +
                ", productPrice=" + productPrice +
                ", availableUnit=" + availableUnit +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.availableUnit, o.getAvailableUnit());
    }
}