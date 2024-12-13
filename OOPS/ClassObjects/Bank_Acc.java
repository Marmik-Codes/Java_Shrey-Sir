class BankAccount{
    int acc_num;
    String accHoldername; 
    double acc_balance ;
    String account_type;
    String branch;
    boolean isActive;
    String currencyType;

    BankAccount(int acc_num , String accHoldername , double acc_balance,String account_type ,String branch,boolean isActive ,String currencyType){
        this.acc_num = acc_num;
        this.accHoldername = accHoldername;
        this.acc_balance = acc_balance;
        this.account_type = account_type;
        this.branch = branch;
        this.isActive = isActive;
        this.currencyType = currencyType;
    }

    void deposit(double amount){
        if (!isActive) {
            System.out.println("Account is inactive. Cannot deposit money.");
            return;
        }
        if (amount > 0) {
            acc_balance += amount;
            System.out.println("Rs. " + amount + " is credited in accnum " + acc_num + " .Total balance is Rs." + this.acc_balance);

        }else {
            System.out.println("Invalid deposit amount.");
        }

    }

    void withdraw(double amount){
        if (!isActive) {
            System.out.println("Account is inactive. Cannot withdraw money.");
            return;
        }
        if( amount > 0 && amount <= acc_balance){
            acc_balance -= amount;
            System.out.println("Rs. " + amount + "is debited from your account " + acc_num + ".Total balance is Rs." + acc_balance);
        }else if (amount > acc_balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount." + acc_num);
        }
        
    }
    void displayAccountInfo(){
        System.out.println("Account number: " + acc_num);
        System.out.println("Account Holder name: " + accHoldername);
        System.out.println("Account type: " + account_type);
        System.out.println("Bank Branch: " + branch);
        System.out.println("Currency Type: " + currencyType);
        System.out.println("Account Status: " + (isActive ? "Active" : "Inactive"));
    }
}

public class Bank_Acc {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(2567, "Marmik Patel",25000, "Savings", "Infocity",false, "INR");

        b1.deposit(2500);
        b1.displayAccountInfo();

        BankAccount b2 = new BankAccount(2567, "Rashmika Patel",30000, "Savings", "Infocity",true, "INR");
        b1.withdraw(500);
        b1.displayAccountInfo();
    }
}
