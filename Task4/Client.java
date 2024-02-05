package Task4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Client {

    protected LocalDate registrationDate;
    protected String name;
    protected int age;
    ArrayList<Order> orders;

    public Client (LocalDate registrationDate, String name, int age) {
        this.registrationDate = registrationDate;
        this.name = name;
        this.age = age;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }
}
