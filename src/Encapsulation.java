// Incapsulation.java: Demonstrates encapsulation in Java
// Encapsulation is the bundling of data (fields) and methods that operate on that data within a single unit (class)
// It restricts direct access to some of an object's components and can prevent accidental modification

public class Encapsulation {

    // Private fields - data is hidden from outside access
    private String accountHolder;
    private double balance;
    private String accountNumber;

    // Constructor - initializes the object
    public Encapsulation(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Public getter method - allows controlled access to private data
    public String getAccountHolder() {
        return accountHolder;
    }

    // Public getter method for balance
    public double getBalance() {
        return balance;
    }

    // Public getter method for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Public setter method - allows controlled modification of private data
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Public method to deposit money - encapsulates the logic for updating balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited AED" + amount + ". New balance: AED" + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Public method to withdraw money - encapsulates validation and balance update logic
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew AED" + amount + ". New balance: AED" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

    // Public method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: AED " + balance);
    }

    // Static method to demonstrate encapsulation
    public static void demonstrateEncapsulation() {
        System.out.println("\n--- Encapsulation Demo ---");

        // Create a bank account object
        Encapsulation account = new Encapsulation("Test Account", "123456789", 50000.0);

        // Display initial account information
        account.displayAccountInfo();

        // Use encapsulated methods to interact with the object
        // Direct access to balance field is not allowed (it's private)
        // account.balance = 5000; // This would cause a compilation error

        // Instead, we use the public methods
        account.deposit(500000);
        account.withdraw(200000);
        account.setAccountHolder("Test Account");

        // Display updated account information
        account.displayAccountInfo();
    }
}
