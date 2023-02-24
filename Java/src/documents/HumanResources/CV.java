package documents.HumanResources;

import documents.Document;

public class CV extends Document {
   private String name;
   private String email;
   private String[] skills;

   public CV(String name, String email, String[] skills) {
       this.name = name;
       this.email = email;
       this.skills = skills;
   }

   public void display() {
       System.out.println("Name: " + name);
       System.out.println("Email: " + email);
       System.out.println("Skills: ");
       for (String skill : skills) {
           System.out.println("- " + skill);
       }
   }
}
