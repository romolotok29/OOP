package Task3.Supply;

import Task3.Contract;

import java.time.LocalDate;

public class SupplyContract extends Contract {

    String productType;
    int amountOfGoods;


    public SupplyContract (){}

    public SupplyContract(String documentNumber, String productType, int amountOfGoods, LocalDate documentDate) {
        super(documentNumber, documentDate);
        this.productType = productType;
        this.amountOfGoods = amountOfGoods;
    }

    @Override
    public void showInfo() {
        System.out.println("Month total amount : " + documentNumber);
        System.out.println("Product type : " + productType);
        System.out.println("Amount of goods : " + amountOfGoods);
        System.out.println("Document date : " + documentDate);

    }
}
