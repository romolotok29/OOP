package Task1;

public class Registry {

    private Contract[] contracts;
    private int currentIndex;

    public Registry() {
        this.contracts = new Contract[10];
        this.currentIndex = 0;
    }

    public void saveDocument(Contract contract) {
        try {
            contract.validate();
            if (currentIndex < 10) {
                contracts[currentIndex++] = contract;
            } else {
                System.out.println("Registry is full. Cannot add more documents.");
            }
        } catch (WrongSequenceException | WrongStartOfSequenceException | WrongEndOfSequenceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public void provideInformation(Contract contract) {
        contract.displayInfo();
    }
}
