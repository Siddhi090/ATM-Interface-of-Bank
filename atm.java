import java.util.Scanner;

class ATM {
    private static Scanner scanner = new Scanner(System.in);
    private static int balance = 0; // Initial balance for the ATM

    public static void main(String[] args) {
        System.out.println("Welcome to the ATM");
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Transactions History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayTransactionsHistory();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayTransactionsHistory() {
        System.out.println("Transaction History:");
        // Implement logic to display transaction history
    }

    private static void withdraw() {
        System.out.println("Enter amount to withdraw:");
        int amount = scanner.nextInt();
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Remaining balance: " + balance);
    }

    private static void deposit() {
        System.out.println("Enter amount to deposit:");
        int amount = scanner.nextInt();
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Remaining balance: " + balance);
    }

    private static void transfer() {
        System.out.println("Enter amount to transfer:");
        int amount = scanner.nextInt();
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        System.out.println("Enter recipient's account number:");
        String recipient = scanner.next();
        balance -= amount;
        System.out.println("Transferred: " + amount + " to " + recipient);
        System.out.println("Remaining balance: " + balance);
    }
}
