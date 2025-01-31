class InsufficientBalanceException  extends Exception{
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}

class InvalidTransactionException extends Exception{
    public InvalidTransactionException(String msg){
        super(msg);
    }
}

class BankAccount{
    private String accholder;
    private double balance;

    public BankAccount(String accholder,double balance){
        this.accholder = accholder;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount <= 0 ){
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
        System.out.println("Deposited: $" + amount);
        // System.out.println("Total balance: $" + balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException, InvalidTransactionException{
        if (amount <= 0) {
            throw new InvalidTransactionException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for this transaction");
        }
        balance -= amount;
        System.out.println("Withdraw: $" + amount);
    }
    public void Getdetails(){
        System.out.println("Account Holder: " + accholder);
        System.out.println("Balance: $" + balance);
    }
    public String getAccholder() {
        return accholder;
    }

    public double getBalance() {
        return balance;
    }
    
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Marmik Patel", 25000);

        
        try {
            acc.Getdetails();

            acc.Getdetails();
            acc.deposit(200);
            System.out.println("Updated balance after deposit: $" + acc.getBalance());
            
            acc.withdraw(2500);
            System.out.println("Updated balance after withdrawal: $" + acc.getBalance());

            acc.withdraw(300000);

        } catch (InsufficientBalanceException   | InvalidTransactionException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
        finally{
            System.out.println("Resources cleaned.");
        }

    }   
}
