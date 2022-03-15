package Q2;

public class InsufficientFundsException extends Exception {
    private double amount;

    public InsufficientFundsException(double amount) {
        super("Sorry, but your account is short by: $");
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}