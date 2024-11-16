class Bank{
    private String accnum ;
    private double balance;

    Bank(String accnum , double balance){
        this.accnum = accnum;
        this.balance = balance;
    }

    public double getbalance(){
        return balance;
    }
    public String getaccnum(){
        return accnum;
    }
}

public class Bank_Acc {
    public static void main(String[] args) {
        Bank b1 = new Bank("30390001012054", 15798);
        
        System.out.println("Account number: " + b1.getaccnum());
        System.out.println("Balance : " + b1.getbalance());
    }
}
