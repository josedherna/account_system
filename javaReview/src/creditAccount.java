public class creditAccount extends Account {
    private double creditLimit;
    public creditAccount() {
        super();
        this.creditLimit = 0;
    }
    public creditAccount(double _creditLimit){
        super();
        this.creditLimit = _creditLimit;
    }
    @Override
    public boolean deposit(double amount) {
        if (amount <= 0 || amount > getBalance()) {
            System.out.println("Amount to deposit must be greater than 0 and can't exceed the current balance");
            return false;
        }
        setBalance(getBalance() - amount);
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > this.creditLimit) {
            System.out.println("Amount to deposit must be greater than 0 and can't exceed the current balance");
            return false;
        }
        setBalance(getBalance() + amount);
        return true;
    }
    @Override
    public String toString() {
        return "The current balance = " + getBalance() + "\n";
    }
}
