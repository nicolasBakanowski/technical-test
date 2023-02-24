package documents;

public class UrgentOrder extends Order {
    private boolean isUrgent;

    public UrgentOrder(int id, String productName, int quantity, double price, boolean isUrgent) {
        super(id, productName, quantity, price);
        this.isUrgent = isUrgent;
    }

    public boolean getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(boolean isUrgent) {
        this.isUrgent = isUrgent;
    }
}
