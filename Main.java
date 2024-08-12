class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize a new bank account
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance is " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance is " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to check the balance of the account
    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount account1 = new BankAccount("123456", "Alice", 1000.0);

        // Display account details
        account1.displayAccountDetails();
        System.out.println();

        // Deposit money
        account1.deposit(500.0);
        System.out.println();

        // Withdraw money
        account1.withdraw(300.0);
        System.out.println();

        // Attempt to withdraw more money than the balance
        account1.withdraw(1500.0);
        System.out.println();

        // Check final balance
        System.out.println("Final balance: " + account1.getBalance());
    }
}
