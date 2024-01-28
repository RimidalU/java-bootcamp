// Suppose that you are provided with a pre-written class BankAccount as described at right. (The headings are shown, but not the method bodies, to save space.) Assume that the fields, constructor, and methods shown are already implemented. You may refer to them or use them in solving this problem if necessary.
// Write a method named transactionFee that will be placed inside the BankAccount class to become a part of each BankAccount object's behavior. The transactionFee method accepts a fee amount (a real number) as a parameter, and applies that fee to the user's past transactions. The fee is applied once for the first transaction, twice for the second transaction, three times for the third, and so on. These fees are subtracted out from the user's overall balance. If the user's balance is large enough to afford all of the fees with greater than $0.00 remaining, the method returns true. If the balance cannot afford all of the fees, the balance is left as 0.0 and the method returns false.
// For example, given the following BankAccount object:
// BankAccount savings = new BankAccount("Jimmy");
// savings.deposit(10.00);
// savings.deposit(50.00);
// savings.deposit(10.00);
// savings.deposit(70.00);
// The account at that point has a balance of $140.00.
// If the following call were made: savings.transactionFee(5.00)
// Then the account would be deducted $5 + $10 + $15 + $20 for the four transactions, leaving a final balance of $90.00. The method would return true.
// If a second call were made,
// savings.transactionFee(10.00)
// Then the account would be deducted $10 + $20 + $30 + $40 for the four transactions, leaving a final balance of $0.00. The method would return false.

// A BankAccount keeps track of a user's money balance and ID, and counts how many transactions deposits/withdrawals) are made.
public class Banking {
    public static void main(String[] args) {

        BankAccount jimmyAcc = new BankAccount("Jimmy");
        jimmyAcc.deposit(70);
        jimmyAcc.deposit(150);
        jimmyAcc.deposit(90);
        System.out.println("Balance " + jimmyAcc.getID() + ": " + jimmyAcc.getBalance());
        System.out.println("transactionFee return: " + jimmyAcc.transactionFee(10));
        System.out.println("Balance " + jimmyAcc.getID() + ": " + jimmyAcc.getBalance());
    }
}