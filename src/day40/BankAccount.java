package day40;


public class BankAccount {

    String  accountType;
    String  accountHolder;
    long accountNumber;
    double balance;

    //setAllTheValue
    public void setAllTheValue(String newAccountType, String newAccountHolder, long newAccountNumber, double newBalance) {
        accountType = newAccountType;
        accountHolder = newAccountHolder;
        accountNumber = newAccountNumber;
        balance = newBalance;
    }

    //show Account Balance
    public void showAccountBalance(){
        System.out.println("current balance = " + balance);
    }
    //show Account Holder Account Type
    public void showAccountHolderType(){
        System.out.println("account Type = " + accountType);
    }

    //getBalance return the balance
    public double getBalance(){
        //after doing a lot of validation to make sure you have correct credential to view the balance
        return balance;
    }

    //deposit
    public void deposit(double amount){
        balance = balance + amount;
    }

    //withdraw
    public void withdraw(double amount){
        balance -= amount;
    }


    //withdraw100$Cash()
    public void withDraw100$cash(){
        withdraw(100);  //reusing the functionality we already have
    }

    //buyProduct(productPrice, count)

    public void purchaseProduct (double productPrice, int count){
        double totalPrice = productPrice * count;
        balance -= totalPrice;

        // or use the withdraw again
        //withdraw(totalPrice);
    }

    //toString

    public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
