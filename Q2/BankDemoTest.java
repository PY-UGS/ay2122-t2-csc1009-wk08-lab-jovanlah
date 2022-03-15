package Q2;

import java.util.Scanner;

public class BankDemoTest{
    public static void main(String[] args){
        
        CheckingAccount acc1 = new CheckingAccount("A123456");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount: $");
        double inputDeposit = input.nextDouble();
        acc1.deposit(inputDeposit);

        System.out.print("Enter withraw amount: $");
        double inputWithdraw = input.nextDouble();

        try {
            acc1.withdraw(inputWithdraw);
            System.out.println("Balance after withdrawal: $" + acc1.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.printf("%s%.2f", e.getMessage(), e.getAmount());
        } finally {
            input.close();
        }
    }

}