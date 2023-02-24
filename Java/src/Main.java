import documents.*;
import documents.HumanResources.*;

public class Main {
   public static void main(String[] args) {
       // Create an invoice and display it
       Invoice invoice = new Invoice(123, "John Doe", 100.0);
       invoice.display();
       
       // Create an order and display it
       Order order = new Order(456, "Jane Smith", "Widget", 10);
       order.display();
       
       // Create an urgent order and display it
       UrgentOrder urgentOrder = new UrgentOrder(789, "Bob Johnson", "Gadget", 5, true);
       urgentOrder.display();
       
       // Create a contract and display it
       Contract contract = new Contract("Alice Lee", "01/01/2023", "12/31/2023");
       contract.display();
       
       // Create a CV and display it
       String[] skills = {"Java", "Python", "C++"};
       CV cv = new CV("David Chen", "david@example.com", skills);
       cv.display();
   }
}
