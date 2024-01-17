package Task3;

import java.time.LocalDate;

public abstract class Contract implements Document {

    protected String documentNumber;
    protected LocalDate documentDate;

    public Contract (){};

    public Contract(String documentNumber, LocalDate documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }
}
