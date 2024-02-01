package Task1;

public class StringManipulations {

    public static void printFirstTwoBlocksOfNumbers(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        if (blocks.length >= 4) {
            System.out.println("First two blocks: " + blocks[0] + "-" + blocks[2]);
        } else {
            System.out.println("Invalid document number format");
        }
    }

    public static void printMaskedDocumentLetters(String documentNumber) {
        String maskedLetters = documentNumber.replaceAll("[a-zA-Z]", "*");
        System.out.println("Masked document number: " + maskedLetters);
    }

    public static void printLowerCaseLetters(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        if (blocks.length >= 5) {
            StringBuilder lowercaseLetters = new StringBuilder("Letters: ");
            lowercaseLetters.append(blocks[1].toLowerCase())
                    .append("/")
                    .append(blocks[3].toLowerCase())
                    .append("/")
                    .append(blocks[4].toLowerCase());
            System.out.println(lowercaseLetters);
        } else {
            System.out.println("Invalid document number format");
        }
    }

    public static void printUpperCaseLettersFormatted(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        if (blocks.length >= 5) {
            StringBuilder uppercaseLetters = new StringBuilder("Letters: ");
            uppercaseLetters.append(blocks[1].toUpperCase())
                    .append("/")
                    .append(blocks[3].toUpperCase())
                    .append("/")
                    .append(blocks[4].toUpperCase());
            System.out.println(uppercaseLetters);
        } else {
            System.out.println("Invalid document number format");
        }
    }

    public static void checkIfContainsSequence(String documentNumber) {
        if (documentNumber.contains("abc")) {
            System.out.println(documentNumber);
        } else {
            System.out.println("Document must contain sequence abc");
        }
    }

    public static void checkIfStartsWithSequence(String documentNumber) {
        if (documentNumber.startsWith("555")) {
            System.out.println(documentNumber);
        } else {
            System.out.println("Document must start with sequence 555");
        }
    }

    public static void checkIfEndsWithSequence(String documentNumber) {
        if (documentNumber.endsWith("1a2b")) {
            System.out.println(documentNumber);
        } else {
            System.out.println("Document must end with sequence 1a2b");
        }
    }



//    public static void checkStartsWithSequence(String documentNumber) {
//        if (!documentNumber.startsWith("555"));
//        System.out.println("Document must start with sequence 555");
//    }
//
//    public static void checkEndsWithSequence(String documentNumber) {
//        if (!documentNumber.endsWith("1a2b"))
//        System.out.println("Document must end with sequence 1a2b");
//    }
}
