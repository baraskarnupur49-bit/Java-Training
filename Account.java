class Bank {
    private int accountNo;
    private String name;
    private double balance;
    private String password;
    private String AccountHolderName;   

    Bank(int accountNo, String name, double balance, String password, String AccountHolderName){
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.AccountHolderName = AccountHolderName;
    }

    public void setName(String name){
        this.name= name;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword (String password){
        this.password = password;
    }

    public String getAccountHolderName(){
        return this.AccountHolderName;
    }

    public void setAccountHolderName(String AccountHolderName){
        this.AccountHolderName = AccountHolderName;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void checkBalance() {
        System.out.println("Total Balance: " + balance);
    }
}

public class Account {
    public static void main(String[] args) {
        Bank b = new Bank(12345, "Kanak", 1000.0, "password123", "Kanak");

        b.deposit(500);
        b.withdraw(200);
        b.checkBalance();
    }
}