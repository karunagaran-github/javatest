package task10;

public class Account {
    private double balance;

    // No-argument constructor
    public Account() {
        // Initialize with a default balance of 0.0
        this.balance = 0.0;
    }

    // Two-argument constructor
    public Account(double initialBalance) {
        // Initialize with the provided initial balance
        this.balance = initialBalance;
    }

    // Method to deposit funds into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw funds from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Create Account objects with different constructors
        Account account1 = new Account();        // No-argument constructor
        Account account2 = new Account(1000.0);  // Two-argument constructor

        // Deposit and withdraw funds
        account1.deposit(500.0);
        account2.withdraw(200.0);

        // Get and print current balances
        System.out.println("Account 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Balance: " + account2.getBalance());
    

	

	}

}
