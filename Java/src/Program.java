import documents.Invoice;
import documents.Order;
import documents.UrgentOrder;

public class Program {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1, "John Doe", 100.0);

        UrgentOrder urgentOrder = new UrgentOrder(2, "Product 2", 1, 75.0, true);

        System.out.println("Invoice:");
        System.out.println("ID: " + invoice.getId());
        System.out.println("Customer Name: " + invoice.getCustomerName());
        System.out.println("Total Amount: " + invoice.getTotalAmount());

        System.out.println();

        System.out.println("Urgent Order:");
        System.out.println("ID: " + urgentOrder.getId());
        System.out.println("Product Name: " + urgentOrder.getProductName());
        System.out.println("Quantity: " + urgentOrder.getQuantity());
        System.out.println("Price: " + urgentOrder.getPrice());
        System.out.println("Is Urgent: " + urgentOrder.getIsUrgent());
    }
}
