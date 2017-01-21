package mattern.william;

/**
 * Created by williammattern on 1/20/17.
 */
public class Account {
    private double balance = 0;

    Account(){}

    Account(double balance){
        this.balance = balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void debitAccount(double debitAmount){
        if (debitAmount < 0){
            System.out.println("Debiting negative balances not allowed");
        } else {
            this.balance += debitAmount;
        }
    }

    public void creditAccount(double creditAmount){
        if (creditAmount < 0){
            System.out.println("Crediting negative balances not allowed");
        } else {
            this.balance -= creditAmount;
        }
    }
}
