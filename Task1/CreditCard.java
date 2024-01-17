package Task1;

public class CreditCard {
    String accountNumber;
    public int accountBalance;

    public CreditCard(String accountNumber, int accountBalance){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void info() {
        System.out.println("Bank account number : " + accountNumber);
        System.out.println("Account balance : " + accountBalance);
        System.out.println();
    }
    public void cashDeposit(int additionalSum) {
        accountBalance += additionalSum;
        System.out.println("Additional sum : +"+ additionalSum + " euro");
    }
    public void cashWithdrawal(int withdrawalSum) {
        accountBalance -= withdrawalSum;
        System.out.println("Cash withdrawal : -"+ withdrawalSum + " euro");
    }
}
