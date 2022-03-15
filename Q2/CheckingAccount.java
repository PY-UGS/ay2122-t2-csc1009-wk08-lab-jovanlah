package Q2;

public class CheckingAccount {
    private double balance;
    private String accNum;

    public CheckingAccount(String accountNum){
        this.accNum = accountNum;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if (amount>this.balance) {
            throw new InsufficientFundsException(this.balance-amount);
        }
        this.balance-=amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getNumber(){
        return this.accNum;
    }


    
}
