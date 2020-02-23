package day46;

public class CheckingAccount extends BankAccount {

//    String accountHolder;
//    long accountNumber;
//    double balance;
    //no additional field in Checking Account

    //Constructor
    public CheckingAccount(String accountHolder, long accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    //this awesome bank account will give you $200 additional, if you deposit more than $3000

    @Override
    public void deposit(int amount) {
        if (amount >= 3000) {
            super.deposit(amount + 200);
        }else {
            super.deposit(amount);
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
