package Task1;

import java.time.LocalDate;

public class SupplyContract extends Contract implements DocumentInfo {

    private String productType;
    private int amountOfGoods;


    public SupplyContract(String documentNumber, LocalDate documentDate, String productType, int amountOfGoods) {
        super(documentNumber, documentDate);
        this.productType = productType;
        this.amountOfGoods = amountOfGoods;
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
        System.out.println("Product Type: " + productType);
        System.out.println("Amount of Goods: " + amountOfGoods);
        System.out.println();
    }
}
