public class debitAccount extends Account {
    //Calls the default parent constructor (Account())
    public debitAccount() {
        super();
    }
    public debitAccount(double promo) {
        setBalance(promo);
    }
    @Override
    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount to deposit must be greater than 0");
            return false;
        }
        setBalance(getBalance() + amount);
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Amount is greater than balance");
            return false;
        }
        else if (amount <= 0) {
            System.out.println("You can not withdraw a value less than or equal to 0");
            return false;
        }
        else {
            setBalance(getBalance() - amount);
        }
        return true;
    }
    @Override
    public String toString() {
        return "The current balance = " + getBalance() + "\n";
    }
}
