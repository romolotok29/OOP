package Task3;

public class Bank {
    int banknote20;
    int banknote50;
    int banknote100;
    int amountInside;

    public Bank (int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public void cashDeposit (int money) {

        amountInside += money;
    }

    public boolean cashWithdrawal (int money) {
        if (this.amountInside < money) {
            System.out.println("Money withdrawal failed");
            return false;
        }
        amountInside -= money;
        System.out.println("Money withdrawal successful");
        return true;
    }

    public void info () {
        System.out.println("Amount inside : " + amountInside);
    }
}
