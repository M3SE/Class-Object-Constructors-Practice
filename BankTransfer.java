public class BankTransfer {
    public static void main(String[] args) {
        // Instantiate two BankAccount objects
        BankAccount account1 = new BankAccount("First Account Balance:", 5000.0);
        BankAccount account2 = new BankAccount("Second Account Balance:", 300.0);

        // Withdraw 100 dollars from the first account
        account1.withdraw(100.0);

        // Deposit 100 dollars into the second account
        account2.deposit(100.0);

        // Print the account details to the console
        account1.printAccountDetails();
        account2.printAccountDetails();
    }
}
