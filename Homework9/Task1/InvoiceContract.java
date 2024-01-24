package Task1;

import java.time.LocalDate;

public class InvoiceContract extends Contract implements DocumentInfo {

    private double totalAmount;
    private String departmentCode;


    public InvoiceContract(String documentNumber, LocalDate documentDate, double totalAmount, String departmentCode) {
        super(documentNumber, documentDate);
        this.totalAmount = totalAmount;
        this.departmentCode = departmentCode;
    }

    @Override
    public void validate() throws WrongSequenceException, WrongStartOfSequenceException, WrongEndOfSequenceException {
        DocumentCorrectness.validateSequence(documentNumber);
        DocumentCorrectness.validateStartOfSequence(documentNumber);
        DocumentCorrectness.validateEndOfSequence(documentNumber);
    }

    @Override
    public void displayInfo() {
        System.out.println("Invoice Contract Information:");
        System.out.println("Document Number: " + documentNumber);
        System.out.println("Document Date: " + documentDate);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Department Code: " + departmentCode);
        System.out.println();

    }
}
