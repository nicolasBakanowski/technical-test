package documents;

public class Invoice {
    private int id;
    private String customerName;
    private double totalAmount;

    public Invoice(int id, String customerName, double totalAmount) {
        this.id = id;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }
}
