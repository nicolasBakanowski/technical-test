package documents;

public class Invoice extends Document {
   private int invoiceNumber;
   private String customerName;
   private double amount;

   public Invoice(int invoiceNumber, String customerName, double amount) {
       this.invoiceNumber = invoiceNumber;
       this.customerName = customerName;
       this.amount = amount;
   }

   public void display() {
       System.out.println("Invoice Number: " + invoiceNumber);
       System.out.println("Customer Name: " + customerName);
       System.out.println("Amount: " + amount);
   }
}
