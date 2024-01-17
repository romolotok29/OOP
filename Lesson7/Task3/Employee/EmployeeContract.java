package Task3.Employee;

import Task3.Contract;

import java.time.LocalDate;

public class EmployeeContract extends Contract {

    LocalDate endOfContract;
    String employeeName;

    public EmployeeContract () {}

    public EmployeeContract (String documentNumber, LocalDate documentDate, LocalDate endOfContract, String employeeName) {
        super(documentNumber, documentDate);
        this.endOfContract = endOfContract;
        this.employeeName = employeeName;
    }

    @Override
    public void showInfo() {
        System.out.println("Document number : " + documentNumber);
        System.out.println("Document date : " + documentDate);
        System.out.println("End of contract : " + endOfContract);
        System.out.println("Employee name : " + employeeName);
    }
}
