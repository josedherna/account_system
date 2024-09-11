public class loanAccount extends Account {
    private double interestRate;
    private double interestBalance;
    private double totalAmountPaid;
    private double totalPrincipalPaid;
    private double totalInterestPaid;
    public loanAccount() {
        super();
        this.interestRate = 0.06;
    }
    public loanAccount(double currentInterestRate) {
        super();
        this.interestRate = currentInterestRate/100.0;
    }
    @Override
    public boolean deposit(double amount) {
        interestBalance = getBalance() * (this.interestRate / 12.0);
        if (amount > getBalance()) {
            System.out.println("Amount is greater than balance");
            return false;
        }
        else if (amount <= 0) {
            System.out.println("You can not deposit a value less than or equal to 0");
            return false;
        }
        else if (amount >= interestBalance) {
            totalInterestPaid += interestBalance;
            amount -= interestBalance;
            setBalance(getBalance() - amount);
            totalPrincipalPaid += amount;
            addTotalInterestPaid();
        }
        else {
            totalPrincipalPaid += amount;
        }
        return true;
    }

    public void addTotalInterestPaid() {
        this.totalAmountPaid = totalInterestPaid + totalPrincipalPaid;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount to borrow must be greater than 0");
            return false;
        }
        setBalance(getBalance() + amount);
        return true;
    }

    public double getTotalInterestPaid() {
        return this.totalInterestPaid;
    }

    public double getTotalPrincipalPaid() {
        return this.totalPrincipalPaid;
    }

    public double getTotalAmountPaid() {
        return this.totalAmountPaid;
    }

    @Override
    public String toString() {
        return "The current balance = " + getBalance() + "\n" + "Total interest paid: " + getTotalInterestPaid() + "\n" +
                "Total principal paid: " + getTotalPrincipalPaid() + "\n" + "Total amount paid: " + getTotalAmountPaid() + "\n";
    }
}
