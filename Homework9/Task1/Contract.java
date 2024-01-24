package Task1;

import java.time.LocalDate;

public abstract class Contract implements DocumentInfo {

    protected String documentNumber;
    protected LocalDate documentDate;

    public Contract(String documentNumber, LocalDate documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    public abstract void validate() throws WrongSequenceException, WrongStartOfSequenceException, WrongEndOfSequenceException;

    public String getDocumentNumber() {
        return documentNumber;
    }

    public LocalDate getDocumentDate() {
        return documentDate;
    }

}

