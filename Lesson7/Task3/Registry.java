package Task3;

public class Registry {

    private Document[] documents = new Document[10];
    private int documentCount = 0;

    public void saveDocument(Document document) {
        if (documentCount < documents.length) {
            documents[documentCount++] = document;
            System.out.println("Document is saved in the registry.");
        } else {
            System.out.println("Registry is full. Cannot add more documents.");
        }
    }

    public void displayDocumentInfo(Document document) {
        document.showInfo();
    }

}
