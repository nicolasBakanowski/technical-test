package documents;

public class Order extends Document {
   private int orderNumber;
   private String customerName;
   private String productName;
   private int quantity;

   public Order(int orderNumber, String customerName, String productName, int quantity) {
       this.orderNumber = orderNumber;
       this.customerName = customerName;
       this.productName = productName;
       this.quantity = quantity;
   }

   public void display() {
       System.out.println("Order Number: " + orderNumber);
       System.out.println("Customer Name: " + customerName);
       System.out.println("Product Name: " + productName);
       System.out.println("Quantity: " + quantity);
   }
}
