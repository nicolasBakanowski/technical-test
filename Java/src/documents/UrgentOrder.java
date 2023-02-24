package documents;

public class UrgentOrder extends Order {
   private boolean isUrgent;

   public UrgentOrder(int orderNumber, String customerName, String productName, int quantity, boolean isUrgent) {
       super(orderNumber, customerName, productName, quantity);
       this.isUrgent = isUrgent;
   }

   public void display() {
       super.display();
       System.out.println("Is Urgent: " + isUrgent);
   }
}
