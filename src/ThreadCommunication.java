// Thread Communication methods

// - waite()
// - notify()
// - notifyAll()

public class ThreadCommunication {
    public static void main(String[] args) {
        // System.out.println("Args: " + args[0]);
        final Customer customer = new Customer();

        new Thread() {
            public void run() {
                customer.withdraw(110);
            }
        }.start();

        new Thread() {
            public void run() {
                customer.deposit(170);
            }
        }.start();
    }

}

class Customer {
    int amount = 100;

    synchronized void withdraw(int amount) {
        System.out.println("Going to withdraw...");
        System.out.println("amount is:  " + this.amount);
        if (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
                this.amount -= amount;
                System.out.println("withdraw completed...");
                System.out.println("amount is:  " + this.amount);
            }
        }
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit...");
        System.out.println("amount is:  " + this.amount);
        this.amount += amount;
        System.out.println("deposit completed!");
        System.out.println("amount is:  " + this.amount);
        notify();
    }
}