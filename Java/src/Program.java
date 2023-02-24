import documents.Invoice;
import documents.Order;

public class Program {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1, "John Doe", 100.0);

        Order order = new Order(1, "Product 1", 2, 50.0);

        System.out.println("Invoice:");
        System.out.println("ID: " + invoice.getId());
        System.out.println("Customer Name: " + invoice.getCustomerName());
        System.out.println("Total Amount: " + invoice.getTotalAmount());

        System.out.println();

        System.out.println("Order:");
        System.out.println("ID: " + order.getId());
        System.out.println("Product Name: " + order.getProductName());
        System.out.println("Quantity: " + order.getQuantity());
        System.out.println("Price: " + order.getPrice());
    }
}
