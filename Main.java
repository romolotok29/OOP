import Task1.CreditCard;
import Task2.Computer;
import Task3.Bank;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        Task1 check

        CreditCard card = new CreditCard("2737416", 1000);


        card.cashDeposit(100);
        card.info();
        card.cashWithdrawal(300);
        card.info();

        CreditCard [] accounts = new CreditCard[3];

        Random random = new Random();

        for (int i = 0; i < accounts.length; i++) {
            String randomAccountNumber = String.valueOf(random.nextInt(10000000, 999999999));
            int accountBalance = random.nextInt(100, 1000);
            accounts[i] = new CreditCard(randomAccountNumber, accountBalance);

            System.out.println("Account balance : " + accounts[i].accountBalance + " euro");

            if (i + 1 < accounts.length) {
                accounts[i].cashDeposit(100);
            } else {
                accounts[i].cashWithdrawal(400);
            }
            accounts[i].info();
        }

        //Task2 check

        Computer number1 = new Computer(3000, "MacBook");
        number1.info();

        System.out.println();

        Computer number2 = new Computer(2000, "Asus", 100, 200);
        number2.info();

//        Task3 check

        Bank bank = new Bank(20, 50, 100);

        bank.cashDeposit(150);
        bank.info();
        bank.cashWithdrawal(100);
        bank.info();
    }
}