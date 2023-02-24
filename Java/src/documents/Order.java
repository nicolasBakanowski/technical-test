package documents;

public class Order {
    private int id;
    private String productName;
    private int quantity;
    private double price;

    public Order(int id, String productName, int quantity, double price) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and setters for the private fields
}
