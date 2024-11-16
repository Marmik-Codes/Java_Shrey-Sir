class Account {
    int accountNumber;
    String accountHolder;
    double balance;

    Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void displaySavingsInfo() {
        displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void displayCurrentInfo() {
        displayAccountInfo();
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }
}

public class Account_System {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(63549, "Marmik", 25000, 5);
        s1.displaySavingsInfo();

        CurrentAccount c1 = new CurrentAccount(96448, "Marmik", 9469, 3500);
        c1.displayCurrentInfo();
    }
}
