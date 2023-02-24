package documents.HumanResources;
import documents.Document;

public class Contract extends Document {
   private String employeeName;
   private String startDate;
   private String endDate;

   public Contract(String employeeName, String startDate, String endDate) {
       this.employeeName = employeeName;
       this.startDate = startDate;
       this.endDate = endDate;
   }

   public void display() {
       System.out.println("Employee Name: " + employeeName);
       System.out.println("Start Date: " + startDate);
       System.out.println("End Date: " + endDate);
   }
}
