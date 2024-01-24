package Task1;

public class DocumentCorrectness {

    public static void validateSequence(String documentNumber) throws WrongSequenceException {
        if (!documentNumber.contains("abc")) {
            throw new WrongSequenceException("Document must contain the sequence 'abc'");
        }
    }
    public static void validateStartOfSequence(String documentNumber) throws WrongStartOfSequenceException {
        if (!documentNumber.startsWith("555")) {
            throw new WrongStartOfSequenceException("Document number must start with the sequence '555'");
        }
    }
    public static void validateEndOfSequence(String documentNumber) throws WrongEndOfSequenceException {
        if (!documentNumber.endsWith("1a2b")) {
            throw new WrongEndOfSequenceException("Document number must end with the sequence '1a2b'");
        }
    }
}
