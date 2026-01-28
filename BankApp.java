import java.util.*;

class BankAccount {
    private String name;
    private int accountNumber;
    private double balance;
    private String aadhaar;
    private String pan;
    private ArrayList<String> transactions = new ArrayList<>();

    BankAccount(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited: " + amount);
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add("Withdrawn: " + amount);
            System.out.println("Please collect your cash.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void displayDetails() {
        System.out.println("\nAccount Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Aadhaar Linked: " + (aadhaar != null ? aadhaar : "Not Linked"));
        System.out.println("PAN Linked: " + (pan != null ? pan : "Not Linked"));
    }

    void linkAadhaar(String aadhaar) {
        this.aadhaar = aadhaar;
        System.out.println("Aadhaar linked successfully.");
    }

    void linkPAN(String pan) {
        this.pan = pan;
        System.out.println("PAN linked successfully.");
    }

    void changeName(String newName) {
        this.name = newName;
        System.out.println("Name updated successfully.");
    }

    void printTransactions() {
        System.out.println("\n--- Transaction History ---");
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String t : transactions) {
                System.out.println(t);
            }
        }
    }

    void miniStatement() {
        System.out.println("\n--- Mini Statement (Last 3 Transactions) ---");
        int start = Math.max(transactions.size() - 3, 0);
        for (int i = start; i < transactions.size(); i++) {
            System.out.println(transactions.get(i));
        }
    }

    double getBalance() {
        return balance;
    }
}

public class BankApp {

    static void bankSection(Scanner sc, BankAccount account) {
        int choice;
        do {
            System.out.println("\n--- BANK SECTION ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Account Details");
            System.out.println("4. Link Aadhaar");
            System.out.println("5. Link PAN");
            System.out.println("6. Change Account Holder Name");
            System.out.println("7. Print Transaction History");
            System.out.println("8. Back");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    account.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 3:
                    account.displayDetails();
                    break;
                case 4:
                    System.out.print("Enter Aadhaar number: ");
                    account.linkAadhaar(sc.nextLine());
                    break;
                case 5:
                    System.out.print("Enter PAN number: ");
                    account.linkPAN(sc.nextLine());
                    break;
                case 6:
                    System.out.print("Enter new name: ");
                    account.changeName(sc.nextLine());
                    break;
                case 7:
                    account.printTransactions();
                    break;
            }
        } while (choice != 8);
    }

    static void atmSection(Scanner sc, BankAccount account) {
        int choice;
        do {
            System.out.println("\n--- ATM SECTION ---");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Check Balance");
            System.out.println("3. Mini Statement");
            System.out.println("4. Back");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Available Balance: " + account.getBalance());
                    break;
                case 3:
                    account.miniStatement();
                    break;
            }
        } while (choice != 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();

        BankAccount account = new BankAccount(name, accNo);

        int choice;
        do {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Bank Section");
            System.out.println("2. ATM Section");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bankSection(sc, account);
                    break;
                case 2:
                    atmSection(sc, account);
                    break;
                case 3:
                    System.out.println("Thank you for using the banking system.");
                    break;
            }
        } while (choice != 3);

        sc.close();
    }
}
