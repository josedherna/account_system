//Jose Hernandez CSC 229 Account Project
public class Main {
    public static void main(String[] args) {
        debitAccount dbt1 = new debitAccount();
        debitAccount dbt2 = new debitAccount(100);
        System.out.println(dbt1.toString());
        System.out.println(dbt2.toString());
        dbt1.deposit(1000);
        System.out.println(dbt1.toString());
        creditAccount cr1 = new creditAccount(1500);
        System.out.println(cr1.toString());
        cr1.withdraw(1500);
        System.out.println(cr1.toString());
        cr1.deposit(500);
        System.out.println(cr1.toString());
        loanAccount lnacc1 = new loanAccount(7);
        lnacc1.withdraw(15000);
        System.out.println(lnacc1.toString());
        lnacc1.deposit(1000);
        System.out.println(lnacc1.toString());
    }
}
