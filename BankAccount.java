public class BankAccount {
    private double balance;
    private String accountHolderName;

    // Constructor
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount +  " into " + accountHolderName);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + " from account of " + accountHolderName);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Method to print account details
    public void printAccountDetails() {
        System.out.println(accountHolderName + " $" + balance);
    }

    public static void main(String[] args) {
        // Instantiate a BankAccount object with 500 dollars
        BankAccount account = new BankAccount("My Account Balance is: ", 500.0);

        // Deposit 100 dollars into the account
        account.deposit(100.0);

        // Print the account details to the console
        account.printAccountDetails();
    }
}