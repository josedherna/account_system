public abstract class Account {
    private double balance;
    private int accountNumber;
    //Default constructor
    public Account() {
        this.balance = 0;
        this.accountNumber = 0;
    }
    //Copy constructor
    public Account(Account acc) {
        this.balance = acc.balance;
        this.accountNumber = acc.accountNumber;
    }
    public Account(double _balance, int accNumber) {
        this.balance = _balance;
        this.accountNumber = accNumber;
    }
    public abstract boolean deposit(double amount);
    public abstract boolean withdraw(double amount);
    public void setBalance(double amount) {
        this.balance = amount;
    }
    public double getBalance() {
        return this.balance;
    }
}
