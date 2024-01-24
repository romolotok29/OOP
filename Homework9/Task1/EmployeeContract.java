package Task1;

import java.time.LocalDate;

public class EmployeeContract extends Contract implements DocumentInfo {

    private LocalDate expiryDate;
    private String employeeName;


    public EmployeeContract(String documentNumber, LocalDate documentDate, LocalDate expiryDate, String employeeName) {
        super(documentNumber, documentDate);
        this.expiryDate = expiryDate;
        this.employeeName = employeeName;
    }

    @Override
    public void validate() throws WrongSequenceException, WrongStartOfSequenceException, WrongEndOfSequenceException {
        DocumentCorrectness.validateSequence(documentNumber);
        DocumentCorrectness.validateStartOfSequence(documentNumber);
        DocumentCorrectness.validateEndOfSequence(documentNumber);
    }

    @Override
    public void displayInfo() {
        System.out.println("Supply Contract Information:");
        System.out.println("Document Number: " + documentNumber);
        System.out.println("Document Date: " + documentDate);
        System.out.println("Expiry date :" + expiryDate);
        System.out.println("Employee name : " + employeeName);
        System.out.println();
    }
}
