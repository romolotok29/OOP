package Task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main (String [] args) {

        EmployeeContract employeeContract = new EmployeeContract(
                "455abc1a2b",
                LocalDate.parse("29-01-2024", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                LocalDate.parse("29-01-2027", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                "Ivan");

        SupplyContract supplyContract = new SupplyContract(
                "555abe1a2b",
                LocalDate.parse("28-02-2024", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                "vegetables",
                1000);

        InvoiceContract invoiceContract = new InvoiceContract(
                "555abc1a4b",
                LocalDate.parse("31-05-2024", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                1555.60,
                "IT135");

        Registry registry = new Registry();

        registry.saveDocument(supplyContract);
        registry.saveDocument(employeeContract);
        registry.saveDocument(invoiceContract);

//        registry.provideInformation(supplyContract);
//        registry.provideInformation(employeeContract);
//        registry.provideInformation(invoiceContract);
    }
}
