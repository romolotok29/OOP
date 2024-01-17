package Task3.Invoice;

import Task3.Contract;

import java.time.LocalDate;

public class Invoice extends Contract {

    double monthTotalAmount;
    String departmentCode;

    public Invoice (){}

    public Invoice (double monthTotalAmount, LocalDate documentDate, String documentNumber, String departmentCode) {
        super(documentNumber, documentDate);
        this.monthTotalAmount = monthTotalAmount;
        this.departmentCode = departmentCode;
    }

    @Override
    public void showInfo() {
        System.out.println("Month total amount : " + monthTotalAmount);
        System.out.println("Document date : " + documentDate);
        System.out.println("Document number : " + documentNumber);
        System.out.println("Department code : " + departmentCode);
    }
}
