package documents;

public class Document {
    private int documentNumber;
    private String documentName;
    
    public Document(int documentNumber, String documentName) {
        this.documentNumber = documentNumber;
        this.documentName = documentName;
    }
    
    public Document() {
        this(0, "");
    }
    
    public void display() {
        System.out.println("Document Number: " + documentNumber);
        System.out.println("Document Name: " + documentName);
    }
}
