public class BankAccount {
    private String id;
    private double balance;
    private int transactions;

    // Constructs a BankAccount
    // object with the given id, and
    // 0 balance and transactions.
    public BankAccount(String id) {
        this.id = id;
        this.balance = 0;
        this.transactions = 0;
    }

    // returns the field values
    public double getBalance() {
        return this.balance;
    }

    public String getID() {
        return this.id;
    }

    // Adds the amount to the balance
    // if it is between 0-500.
    // Also counts as 1 transaction.
    public void deposit(double amount) {
        if (amount >= 0 && amount < 500) {
            this.balance += amount;
            this.transactions += 1;
        }
    }

    // Subtracts the amount from the balance if the user has enough money.
    // Also counts as 1 transaction.
    public void withdraw(double amount) {
        if (amount >= balance) {
            this.balance = 0;
        } else {
            balance -= amount;
        }
    }

    // your method would go here
    public boolean transactionFee(double feeAmount) {
        double feeAmountSum = 0.00;

        for (int i = 1; i <= this.transactions; i += 1) {
            feeAmountSum += feeAmount * i;
        }
        this.withdraw(feeAmountSum);
        return this.balance > feeAmountSum ? true : false;
    }
}
