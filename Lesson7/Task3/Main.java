package Task3;

import Task3.Employee.EmployeeContract;
import Task3.Invoice.Invoice;
import Task3.Supply.SupplyContract;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main (String[] args) {

        Registry registry = new Registry();

        SupplyContract supply = new SupplyContract(
                "420",
                "Tomato",
                1,
                LocalDate.parse("24-01-2001", DateTimeFormatter.ofPattern("dd-MM-yyyy"))

        );

        registry.saveDocument(supply);
        registry.displayDocumentInfo(supply);

        System.out.println();

        EmployeeContract employee = new EmployeeContract(
                "419",
                LocalDate.parse("15-02-2024", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                LocalDate.parse("15-02-2026", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                "Ivan"
                );

        registry.saveDocument(employee);
        registry.displayDocumentInfo(employee);

        System.out.println();

        Invoice invoice = new Invoice(
                1500.20d,
                LocalDate.parse("19-02-2026", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                "418",
                "LT220"
                );

        registry.saveDocument(invoice);
        registry.displayDocumentInfo(invoice);

    }
}
